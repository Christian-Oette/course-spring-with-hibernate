package de.oette.course.I01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean
    public I01DemoComponent myDemoComponent() {
        return new I01DemoComponent();
    }
}
