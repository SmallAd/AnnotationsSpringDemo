package testgroup.annotationsspringdemo.service;

/**
 *
 * @author smallad
 */
public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
    
}
