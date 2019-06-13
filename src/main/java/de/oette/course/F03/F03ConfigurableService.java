package de.oette.course.F03;

import org.springframework.stereotype.Component;

@SuppressWarnings("FieldCanBeLocal")
public class F03ConfigurableService {

    private int timeoutInMs;
    private boolean isDebug;

    public F03ConfigurableService() {
        System.out.println("F03 configurable service created.");
    }


    public F03ConfigurableService(int timeoutInMs, boolean isDebug) {
        this.timeoutInMs = timeoutInMs;
        this.isDebug = isDebug;
    }

    public static class Builder {
        private int timeoutInMs;
        private boolean isDebug;

        public Builder setTimeoutInMs(int timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            return this;
        }

        public Builder setIsDebug(boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }

        public F03ConfigurableService build() {
            return new F03ConfigurableService(timeoutInMs, isDebug);
        }
    }
}
