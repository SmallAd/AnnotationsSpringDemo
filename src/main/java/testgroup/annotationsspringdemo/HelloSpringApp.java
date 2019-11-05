package testgroup.annotationsspringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import testgroup.annotationsspringdemo.model.coach.Coach;

/**
 *
 * @author smallad
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

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
