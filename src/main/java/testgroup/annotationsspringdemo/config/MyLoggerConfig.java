package testgroup.annotationsspringdemo.config;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author smallad
 */
@Component
public class MyLoggerConfig {
    
    @Value("${rootLoggerLevel}")
    private String rootLoggerLevel;
    @Value("${printedLoggerLevel}")
    private String printedLoggerLevel;
    
    @PostConstruct
    public void initLogger(){
        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);
        
        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
        
        Logger loggerParent = applicationContextLogger.getParent();
        loggerParent.setLevel(rootLevel);
        
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());
        
        loggerParent.addHandler(consoleHandler);
    }
    
}
