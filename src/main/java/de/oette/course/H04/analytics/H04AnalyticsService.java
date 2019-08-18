package de.oette.course.H04.analytics;

import org.springframework.stereotype.Service;

@Service
public class H04AnalyticsService {

    public void onCustomerCreation() {
        System.out.println("Great, we have new customer.");
    }
}
