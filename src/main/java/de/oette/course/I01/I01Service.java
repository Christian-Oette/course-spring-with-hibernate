package de.oette.course.I01;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class I01Service {

    private final ApplicationContext applicationContext;

    public I01Service(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {
        I01DemoComponent bean = (I01DemoComponent) applicationContext.getBean(I01DemoComponent.class);
        bean.printHello();
    }
}
