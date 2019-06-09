package de.oette.course.C04;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class FavouriteColorTest {
    private static final String LIST_URL = "http://localhost:8080/list-colors/";
    private static final String STORE_URL = "http://localhost:8080/store-color";

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    void testColors() {

        restTemplate.postForLocation(STORE_URL +  "?colorName=green", null);
        restTemplate.postForLocation(STORE_URL +  "?colorName=blue", null);
        restTemplate.postForLocation(STORE_URL +  "?colorName=yellow", null);

        ResponseEntity<ColorsDto> response = restTemplate.getForEntity(LIST_URL, ColorsDto.class);
        assertThat(response).isNotNull();
        ColorsDto body = response.getBody();
        assertThat(body).isNotNull();
        List<FavouriteColor> colorList = body.getFavouriteColorList();
        assertThat(colorList).isNotNull()
                .extracting(FavouriteColor::getName)
                .containsExactlyInAnyOrder("green", "blue", "yellow");
    }
}
