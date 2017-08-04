package com.clairvoyant.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import java.util.Arrays;
//import com.prashil.com.clairvoyant.testapp.test.Prashil;
/**
 * Created by prashil on 10/10/16.
 */
@ComponentScan({"com.prashil.masker","com.prashil.ingestor","com.prashil.inspector"})
@SpringBootApplication
public class test {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(test.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}