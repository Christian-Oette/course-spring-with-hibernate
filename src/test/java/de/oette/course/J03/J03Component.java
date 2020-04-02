package de.oette.course.J03;

import org.springframework.stereotype.Component;

@Component
public class J03Component {

    public boolean loadFlag() {
        System.out.println("load flag");
        return true;
    }
}
