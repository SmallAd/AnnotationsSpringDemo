package testgroup.annotationsspringdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import testgroup.annotationsspringdemo.config.SportConfig;
import testgroup.annotationsspringdemo.model.coach.Coach;

/**
 *
 * @author smallad
 */
public class JavaConfigDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("baseballCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println("-----------------------");
        
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(secondCoach.getDailyWorkout());
        System.out.println(secondCoach.getDailyFortune());
        System.out.println("-----------------------");

        Coach thirdCoach = context.getBean("trackCoach", Coach.class);
        System.out.println(thirdCoach.getDailyWorkout());
        System.out.println(thirdCoach.getDailyFortune());

        context.close();

    }
}
