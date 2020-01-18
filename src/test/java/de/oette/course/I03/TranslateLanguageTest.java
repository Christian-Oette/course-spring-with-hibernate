package de.oette.course.I03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = TranslateLanguageTest.TestConfig.class)
public class TranslateLanguageTest {

    @Autowired
    private I03GreetingTranslator translatorToSpanish;

    @Autowired
    private I03GreetingTranslator translatorToDanish;

    @Test
    public void thatTranslationIsInSpanish() {
        assertThat(translatorToSpanish.translateHello()).isEqualTo("Hola");
    }

    @Test
    public void thatTranslationIsInDanish() {
        assertThat(translatorToDanish.translateHello()).isEqualTo("Hej");
    }


    @Configuration
    @ComponentScan(value = "de.oette.course.I03")
    public static class TestConfig {

    }
}
