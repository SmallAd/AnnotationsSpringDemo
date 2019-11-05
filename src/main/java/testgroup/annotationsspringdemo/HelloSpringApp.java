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

        Coach coach = context.getBean("trackCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
