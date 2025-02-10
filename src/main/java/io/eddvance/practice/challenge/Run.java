package io.eddvance.practice.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class Run {

    public static void main(String[] args) {
        SpringApplication spa = new SpringApplication(Run.class);
        Environment env = spa.run(args).getEnvironment();

        String profile = env.getProperty("app.profile", "Spring boot 3");
        spa.setAdditionalProfiles(profile);
        System.out.println("Launch in " + profile + " mode (error handling configured)");
    }
}