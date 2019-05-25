package de.oette.course.A01;

public class MainService {

    private SubService subService;

    public MainService(SubService subService) {
        this.subService = subService;
    }

    public void logMessage() {
        subService.logMessage();
    }
}
