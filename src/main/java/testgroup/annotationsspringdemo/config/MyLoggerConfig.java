package testgroup.annotationsspringdemo.config;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import lombok.Setter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author smallad
 */
public class MyLoggerConfig {
    
    @Setter
    private String rootLoggerLevel;
    @Setter
    private String printedLoggerLevel;
    
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
