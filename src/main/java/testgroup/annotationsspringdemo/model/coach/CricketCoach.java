package testgroup.annotationsspringdemo.model.coach;

import lombok.Getter;
import lombok.Setter;
import testgroup.annotationsspringdemo.service.FortuneService;

/**
 *
 * @author smallad
 */
public class CricketCoach implements Coach {

    @Setter
    private FortuneService fortuneService;
    @Getter @Setter
    private String team;
    @Getter @Setter
    private String email;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
