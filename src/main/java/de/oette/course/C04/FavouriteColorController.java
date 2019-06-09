package de.oette.course.C04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavouriteColorController {

    private final FavouriteColorService colorService;

    public FavouriteColorController(FavouriteColorService colorService) {
        this.colorService = colorService;
    }

    @PostMapping("/store-color")
    public void getFavouriteColors(@RequestParam String colorName) {
        colorService.storeColor(colorName);
    }


    @GetMapping("/list-colors")
    public ColorsDto getFavouriteColors() {
        List<FavouriteColor> colors = colorService.loadColors();
        ColorsDto colorsDto = new ColorsDto();
        colorsDto.setFavouriteColorList(colors);
        return colorsDto;
    }
}
