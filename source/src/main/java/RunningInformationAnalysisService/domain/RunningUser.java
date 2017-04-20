package RunningInformationAnalysisService.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by vagrant on 4/16/17.
 */
@Embeddable
@Data
public class RunningUser {


    private Integer userId;
    private String userName;
    private String userAddress;


    public RunningUser(Integer userId, String userName, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
    }
    public RunningUser(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }



}
