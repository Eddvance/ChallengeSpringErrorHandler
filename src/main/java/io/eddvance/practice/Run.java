package io.eddvance.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.eddvance.practice.error_handling")
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
