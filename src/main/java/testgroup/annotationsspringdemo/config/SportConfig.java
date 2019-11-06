package testgroup.annotationsspringdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import testgroup.annotationsspringdemo.model.coach.Coach;
import testgroup.annotationsspringdemo.model.coach.SwimCoach;
import testgroup.annotationsspringdemo.service.FortuneService;
import testgroup.annotationsspringdemo.service.SadFortuneService;

/**
 *
 * @author smallad
 */
@Configuration
@ComponentScan("testgroup.annotationsspringdemo")
@PropertySource("fortune.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
