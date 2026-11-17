
package com.practice.springboot_war_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWarPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWarPracticeApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<html><head><title>Spring Boot WAR Practice</title></head>"
                + "<body style='font-family:Arial;margin:40px;'>"
                + "<h1>Welcome to My Spring Boot WAR Project!</h1>"
                + "<h2>Deployed on Apache Tomcat 9</h2>"
                + "<p>This application was developed using:</p>"
                + "<ul><li>Java 11</li><li>Spring Boot 2.7.18</li>"
                + "<li>Apache Maven</li><li>Apache Tomcat 9</li></ul>"
                + "<p>My first external Tomcat deployment on AWS EC2.</p>"
                + "<h3>Status: Application is running successfully!</h3>"
                + "</body></html>";
    }
}
