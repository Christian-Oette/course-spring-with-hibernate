package de.oette.course.A01;


import org.junit.jupiter.api.Test;

class OnlyUnitTest {

    @Test
    void testWithoutSpring()  {
      final SubService subService = new SubService();
      final MainService mainService = new MainService(subService);

      mainService.logMessage();
    }
}
