package de.oette.course.I02.rating;

import org.springframework.stereotype.Component;

@Component
public class DefaultRatingHandler implements RatingHandler {

    @Override
    public void newRating(Rating rating) {
        System.out.println("Default handling of " + rating);
    }
}
