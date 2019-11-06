package testgroup.annotationsspringdemo.model.coach;

import testgroup.annotationsspringdemo.service.FortuneService;

/**
 *
 * @author smallad
 */
public class SwimCoach implements Coach{
    
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
