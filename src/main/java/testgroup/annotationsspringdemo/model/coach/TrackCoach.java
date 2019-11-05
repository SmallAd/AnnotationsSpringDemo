package testgroup.annotationsspringdemo.model.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testgroup.annotationsspringdemo.service.FortuneService;

@Component
public class TrackCoach implements Coach {
    
    FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
