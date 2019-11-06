package testgroup.annotationsspringdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testgroup.annotationsspringdemo.model.coach.Coach;
import testgroup.annotationsspringdemo.model.coach.SwimCoach;
import testgroup.annotationsspringdemo.service.FortuneService;
import testgroup.annotationsspringdemo.service.SadFortuneService;

/**
 *
 * @author smallad
 */
@Configuration
public class SwimConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
