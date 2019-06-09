package de.oette.course.C04;

import java.util.ArrayList;
import java.util.List;

public class ColorsDto {

    private List<FavouriteColor> favouriteColorList = new ArrayList<>();
    public List<FavouriteColor> getFavouriteColorList() {
        return favouriteColorList;
    }
    public void setFavouriteColorList(List<FavouriteColor> favouriteColorList) {
        this.favouriteColorList = favouriteColorList;
    }
}
