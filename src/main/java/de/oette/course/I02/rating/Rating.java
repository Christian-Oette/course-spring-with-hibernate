package de.oette.course.I02.rating;

public class Rating {
    public String text;
    public int nrOfStars;

    @Override
    public String toString() {
        return "Rating{" +
                "text='" + text + '\'' +
                ", nrOfStars=" + nrOfStars +
                '}';
    }
}
