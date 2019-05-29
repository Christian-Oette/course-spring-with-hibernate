package de.oette.course.A03.sub2;

import de.oette.course.A04.LuckyNumberGenerator;
import org.springframework.stereotype.Component;

@Component
public class A03_Sub2 implements LuckyNumberGenerator {

    public A03_Sub2() {
        System.out.println("sub2");
    }

    @Override
    public int getMyNumber() {
        return 53;
    }
}
