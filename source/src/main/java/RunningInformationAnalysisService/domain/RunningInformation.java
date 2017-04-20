package RunningInformationAnalysisService.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import lombok.Data;


/**
 * Created by vagrant on 4/16/17.
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Data
public class RunningInformation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long runningId;

    //private RunningUser runningUser;
    private Float latitude;
    private Integer runningDistance;
    private Integer totalRunningTime;
    private Integer heartRate;
    @Column(name = "Timestamp")
    private java.sql.Timestamp Timestamp;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "userId", column = @Column(name = "runningUser_userId")),
            @AttributeOverride(name = "userName", column = @Column(name = "runningUser_userName")),
            @AttributeOverride(name = "userAddress", column = @Column(name = "runningUser_userAddress"))
    })
    private RunningUser runningUser;
    private HEALTHWARNINGLEVEL HealthWarningLevel;

    enum HEALTHWARNINGLEVEL{
       UNKNOWN, LOW, NORMAL, HIGH
    }

    public HEALTHWARNINGLEVEL getHealthWarningLevel() {
        return HealthWarningLevel;
    }

    public void setHealthWarningLevel(HEALTHWARNINGLEVEL healthWarningLevel) {
        if(heartRate < 60 || heartRate > 200){
            this.HealthWarningLevel = HEALTHWARNINGLEVEL.UNKNOWN;
        } else if (heartRate >= 60 && heartRate <= 75){
            this.HealthWarningLevel = HEALTHWARNINGLEVEL.LOW;
        } else if (heartRate > 75 && heartRate < 120){
            this.HealthWarningLevel = HEALTHWARNINGLEVEL.NORMAL;
        } else {
            this.HealthWarningLevel = HEALTHWARNINGLEVEL.HIGH;
        }
    }


    public RunningUser getRunningUser() {
        return runningUser;
    }



    public void setRunningUser(RunningUser runningUser) {
        this.runningUser = runningUser;
    }

    public Long getRunningId() {
        return runningId;
    }

    public void setRunningId(Long runningId) {
        this.runningId = runningId;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Integer getRunningDistance() {
        return runningDistance;
    }

    public void setRunningDistance(Integer runningDistance) {
        this.runningDistance = runningDistance;
    }

    public Integer getTotalRunningTime() {
        return totalRunningTime;
    }

    public void setTotalRunningTime(Integer totalRunningTime) {
        this.totalRunningTime = totalRunningTime;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public java.sql.Timestamp getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
        Timestamp = timestamp;
    }






}
