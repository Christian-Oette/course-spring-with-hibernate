package de.oette.course.B07;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorControllerTest {

    private static final String URL = "http://localhost:8080/calculate/";
    private RestTemplate restTemplate = new RestTemplate();


    @Test
    void testSum() {
        ResponseEntity<Integer> response = restTemplate.getForEntity(URL + "sum?x=5&y=7", Integer.class);
        assertThat(response).isNotNull();
        Integer body = response.getBody();
        assertThat(body).isEqualTo(12);
    }

    @Test
    void testMultiply() {
        ResponseEntity<Integer> response = restTemplate.getForEntity(URL + "multiply?x=2&y=10", Integer.class);
        assertThat(response).isNotNull();
        Integer body = response.getBody();
        assertThat(body).isEqualTo(20);
    }
}