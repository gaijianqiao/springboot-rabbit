package my.learn.boot.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloRabbitMq")

public class RabbitMqConsumer {

    private int count;
    @RabbitHandler
    public void process(String m)
    {
        System.out.println(m+":"+count++);
    }

}
