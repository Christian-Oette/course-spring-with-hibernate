package de.oette.course.A01;

public class MainService {


  private final SubService subService;

  public MainService(final SubService subService) {
    this.subService = subService;
  }

  public void logMessage() {
    subService.logMessage();
  }
}
