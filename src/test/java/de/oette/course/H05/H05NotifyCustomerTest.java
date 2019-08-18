package de.oette.course.H05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = H05NotifyCustomerTest.TestConfig.class)
public class H05NotifyCustomerTest {

    @Autowired
    private H05CustomerService customerService;

    @Autowired
    private H05EmailService emailService;

    @Test
    public void testNotification() {
        // given
        AtomicReference<String> receiverResult = new AtomicReference<>();
        AtomicReference<String> textResult = new AtomicReference<>();

        // when
        customerService.setResponseListener(
                (receiver, text) -> {
                    receiverResult.set(receiver);
                    textResult.set(text);
                }
        );
        emailService.receiveIncomingMessage("Tom", "Hello");

        // then
        assertThat(receiverResult.get()).isEqualTo("Tom");
        assertThat(textResult.get()).isEqualTo("Hello");
    }


    @ComponentScan(value = "de.oette.course.H05")
    @Configuration
    protected static class TestConfig {

    }

}
