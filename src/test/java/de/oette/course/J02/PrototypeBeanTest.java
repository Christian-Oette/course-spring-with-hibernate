package de.oette.course.J02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = PrototypeBeanTest.TestConfig.class)
public class PrototypeBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() {

    }


    @Configuration
    public static class TestConfig {

    }

    public static class DataTransportObject {
        String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
