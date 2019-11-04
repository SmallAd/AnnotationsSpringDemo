package testgroup.annotationsspringdemo.service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private static final String[] FORTUNES = new String[]{
        "Beware of the wolf in sheep's clothing",
        "Diligence is the mother of good luck",
        "The journey is the reward"
    };

//    static {
//        FORTUNES.add("Beware of the wolf in sheep's clothing");
//        FORTUNES.add("Diligence is the mother of good luck");
//        FORTUNES.add("The journey is the reward");
//    }

    @Override
    public String getFortune() {
        Random rand = new Random();
        return FORTUNES[rand.nextInt(FORTUNES.length)];
    }

}
