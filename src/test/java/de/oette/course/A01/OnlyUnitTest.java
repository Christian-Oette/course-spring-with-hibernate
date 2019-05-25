package de.oette.course.A01;


import org.junit.jupiter.api.Test;

class OnlyUnitTest {

    @Test
    void testWithoutSpring()  {
        SubService subService = new SubService();
        MainService mainService = new MainService(subService);

        mainService.logMessage();
    }
}
