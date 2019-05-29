package de.oette.course.A03.sub1;

import de.oette.course.A04.LuckyNumberGenerator;
import org.springframework.stereotype.Service;

@Service
public class A03_Sub1 implements LuckyNumberGenerator {

    public A03_Sub1() {
        System.out.println("sub1");
    }

    @Override
    public int getMyNumber() {
        return 27;
    }
}
