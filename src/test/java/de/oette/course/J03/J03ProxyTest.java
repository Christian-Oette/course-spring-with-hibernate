package de.oette.course.J03;

import org.junit.jupiter.api.Test;

class J03ProxyTest {

    @Test
    void testWrapComponentInProxy() {
        J03Component component = new J03Component();
        component.loadFlag();
    }
}
