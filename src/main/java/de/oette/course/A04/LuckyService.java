package de.oette.course.A04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LuckyService {

    @Autowired
    private LuckyNumberGenerator generator;

    @EventListener(ApplicationReadyEvent.class)
    public void whenReady() {
        System.out.println(generator.getMyNumber());
    }
}
