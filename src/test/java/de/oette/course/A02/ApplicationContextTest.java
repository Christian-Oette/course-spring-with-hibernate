package de.oette.course.A02;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;

class ApplicationContextTest {

  @Test
  void testInitSpring() {
    final GenericApplicationContext context = new GenericApplicationContext();
    context.refresh();
    context.registerBean(TestContext.class);

    final TestContext bean = context.getBean(TestContext.class);
    System.out.println(bean);

    final TestContext bean2 = context.getBean(TestContext.class);
    System.out.println(bean2);
  }

  private static class TestContext {

  }
}
