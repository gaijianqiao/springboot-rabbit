package my.learn.boot.rabbitmq.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Provider {
    @Autowired
    private AmqpTemplate template;

    public void send()
    {
        String content = "provider send content: "+new Date().toLocaleString();
        System.out.println(content);
        template.convertAndSend("helloRabbitMq",content);
    }
}
