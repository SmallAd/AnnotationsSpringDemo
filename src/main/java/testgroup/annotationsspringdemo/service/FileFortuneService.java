package testgroup.annotationsspringdemo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

    @Value("${fortune.filename}")
    private String filename;

    private final Random random = new Random();
    private final List<String> fortunes = new ArrayList<>();

    @PostConstruct
    private void init() {
        Resource resource = new ClassPathResource(filename);
        try (BufferedReader br = new BufferedReader(new FileReader(resource.getFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                fortunes.add(line);
            }
        } catch (IOException ex) {
            fortunes.clear();
            fortunes.add("Have a nice day!");
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }

}
