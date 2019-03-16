package my.learn.boot.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(RabbitConsumerMain.class,args);
    }
}
