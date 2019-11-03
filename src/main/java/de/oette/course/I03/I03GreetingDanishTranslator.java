package de.oette.course.I03;

import org.springframework.stereotype.Component;

@Component
public class I03GreetingDanishTranslator implements I03GreetingTranslator {

    @Override
    public String translateHello() {
        return "Hej";
    }
}
