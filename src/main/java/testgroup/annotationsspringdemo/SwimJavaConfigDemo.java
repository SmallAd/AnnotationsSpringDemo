package testgroup.annotationsspringdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import testgroup.annotationsspringdemo.config.SwimConfig;
import testgroup.annotationsspringdemo.model.coach.Coach;

/**
 *
 * @author smallad
 */
public class SwimJavaConfigDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SwimConfig.class);

        Coach coach = context.getBean("swimCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
