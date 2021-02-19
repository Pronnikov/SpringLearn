package ru.pronnikov.spring_learn.consuming_rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerRestApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumerRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @Bean
    public CommandLineRunner cmr(RestTemplate restTemplate) {
        return args -> {
            Employee employee = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/1",
                                    Employee.class);
            log.info(employee.toString());
        };
    }

}
