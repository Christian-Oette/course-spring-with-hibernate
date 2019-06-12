package de.oette.course.E02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThDemoController {

    @GetMapping(value = {"/", "index.html"})
    public ModelAndView index() {
        List<CardData> data = new ArrayList<>();
        data.add(createCardData("Title", "Text"));
        data.add(createCardData("Welcome", "to my Page"));
        data.add(createCardData("Hello", "World"));


        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("cardData", data);
        return modelAndView;
    }

    private CardData createCardData(String title, String text) {
        CardData cardData = new CardData();
        cardData.setTitle(title);
        cardData.setText(text);
        return cardData;
    }

    @GetMapping(value = {"/contact", "contact.html"})
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }
}
