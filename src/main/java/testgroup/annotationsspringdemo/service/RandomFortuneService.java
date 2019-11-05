package testgroup.annotationsspringdemo.service;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private static final String[] FORTUNES = new String[]{
        "Beware of the wolf in sheep's clothing",
        "Diligence is the mother of good luck",
        "The journey is the reward"
    };

    private Random rand = new Random();

    @Override
    public String getFortune() {
        int index = rand.nextInt(FORTUNES.length);
        return FORTUNES[index];
    }

}
