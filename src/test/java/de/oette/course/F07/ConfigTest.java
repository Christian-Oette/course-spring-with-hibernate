package de.oette.course.F07;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test for correct creation of random string.
 * e.g.
 *
 * UCwMuBzSlLohFKYrIjfTJceXXTthgX
 * AltaKSTJBOQrmQlyNWxcideNvvBnFU
 */
@SpringBootTest
public class ConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testRandomString() {
        // given
        CustomStringUtils utils = applicationContext.getBean(CustomStringUtils.class);

        // when
        String result = utils.createRandomString();

        // then
        assertThat(result)
                .isNotNull()
                .hasSize(30)
                .doesNotContainPattern("[0-9]");
    }
}
