package de.oette.course.A05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ApplicationContextTest.TestConfig.class)
class ApplicationContextTest {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * TODO This test should work without errors. Use what you learned in the last chapter!
     */
    @Test
    void testInitSpring() {
        assertThat(applicationContext).isNotNull();
        Calculator calculator = applicationContext.getBean(Calculator.class);
        assertThat(calculator).isNotNull();
        assertThat(calculator.sum(1,2)).isEqualTo(3);
    }


    // If you want to use component scan, add it here!
    @Configuration
    static class TestConfig {

    }

}
