package de.oette.course.F03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupConfiguration {

    @Bean
    public F03ConfigurableService service() {
        return new F03ConfigurableService.Builder()
                .setTimeoutInMs(1000)
                .setIsDebug(true)
                .build();
    }

    @Bean
    public F03Component f03Component() {
        return new F03Component(service());
    }
}
