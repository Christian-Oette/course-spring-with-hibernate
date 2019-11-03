package de.oette.course.I02.controller;

import de.oette.course.I02.rating.Rating;
import de.oette.course.I02.rating.RatingHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Mac/Linux
 * curl -XPOST http://localhost:8080/rating -H "Content-Type: application/json" -d '{"text":"great product", "nrOfStars":"5"}'
 * <p>
 * Windows
 * curl -XPOST "localhost:8080" -H "Content-Type: application/json" -d "{\"text\" : \"great product\", \"nrOfStars\" : \"5\" }"
 */
@RestController("/rating")
public class RatingController {

    private final RatingHandler ratingHandler;

    public RatingController(RatingHandler ratingHandler) {
        this.ratingHandler = ratingHandler;
    }

    @PostMapping
    public void newRating(@RequestBody Rating rating) {
        ratingHandler.newRating(rating);
    }
}
