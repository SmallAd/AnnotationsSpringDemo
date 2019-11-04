package testgroup.annotationsspringdemo.model.coach;

import testgroup.annotationsspringdemo.service.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes to train shots";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
