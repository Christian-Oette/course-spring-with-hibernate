package de.oette.course.I02.rating;

import org.springframework.stereotype.Component;

@Component
public class ForwardToSocialMediaRatingHandler implements RatingHandler {

    @Override
    public void newRating(Rating rating) {
        System.out.println("Social media forward of " + rating);
    }
}
