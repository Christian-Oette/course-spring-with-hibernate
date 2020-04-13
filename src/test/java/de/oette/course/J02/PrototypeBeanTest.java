package de.oette.course.J02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;


@SpringBootTest(classes = PrototypeBeanTest.TestConfig.class)
public class PrototypeBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototypeScope() {

    }


    @Configuration
    public static class TestConfig {

    }

    public static class DataTransportObject {
        String value;

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
