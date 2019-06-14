package de.oette.course.F07;

import org.apache.commons.lang3.RandomStringUtils;

@SuppressWarnings("FieldCanBeLocal")
public class CustomStringUtils {


    private Integer randomLength;
    private Boolean useLetters;
    private Boolean useNumbers;

    public String createRandomString() {
        return RandomStringUtils.random(randomLength, true, false);
    }

    public void setRandomLength(Integer randomLength) {
        this.randomLength = randomLength;
    }

    public void setUseLetters(Boolean useLetters) {
        this.useLetters = useLetters;
    }

    public void setUseNumbers(Boolean useNumbers) {
        this.useNumbers = useNumbers;
    }
}
