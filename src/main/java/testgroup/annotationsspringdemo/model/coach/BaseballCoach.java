package testgroup.annotationsspringdemo.model.coach;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

}
