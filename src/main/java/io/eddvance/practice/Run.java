package io.eddvance.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.eddvance.practice.challenge")
public class Run {

    public static void main(String[] args) {
        SpringApplication spa = new SpringApplication(Run.class);

        boolean useSb3 = true;
        if (useSb3) {
            spa.setAdditionalProfiles("Spring boot 3");
            System.out.println("Launch in Spring Boot 3 mode (ProblemDetail error handling))");
        } else {
            spa.setAdditionalProfiles("Spring boot 2");
            System.out.println("Launch in Spring Boot 2 mode (custom error handling))");
        }
        spa.run(args);
    }
}