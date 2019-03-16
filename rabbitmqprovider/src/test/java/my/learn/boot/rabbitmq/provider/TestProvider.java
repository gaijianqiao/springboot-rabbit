package my.learn.boot.rabbitmq.provider;

import my.learn.boot.rabbitmq.RabbitMqProviderMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqProviderMain.class)

public class TestProvider {
    @Autowired
    private Provider provider;

    @Test
    public void testSendInfo() {
        for (int i = 0; i < 100000; i++) {
            provider.send();
        }
    }
}
