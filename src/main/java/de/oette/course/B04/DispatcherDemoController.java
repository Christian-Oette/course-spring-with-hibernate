package de.oette.course.B04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/", "/v2"})
@ResponseBody
public class DispatcherDemoController {

    @GetMapping(value = {"/{text}", "/hello/{text}", "/{text}/hello"})
    public String root(@PathVariable(required = false, value = "text") String myText) {
        return myText;
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "/hello-world";
    }
}
