package RunningInformationAnalysisService.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by vagrant on 4/17/17.
 */
@SpringBootApplication
public class RunningInformationAnalysisServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(RunningInformationAnalysisServiceApplication.class);
    }
}
