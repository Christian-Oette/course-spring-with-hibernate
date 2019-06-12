package de.oette.course.E02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThDemoController {

    @GetMapping(value = {"/", "index.html"})
    public ModelAndView index() {
        CardData cardData = new CardData();
        cardData.setTitle("Title");
        cardData.setText("Text");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("cardData", cardData);
        return modelAndView;
    }

    @GetMapping(value = {"/contact", "contact.html"})
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }
}
