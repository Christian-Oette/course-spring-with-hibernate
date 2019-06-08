package de.oette.course.B05;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestDemoController {

    private String temp = "";

    @GetMapping
    public String get() {
        return temp;
    }

    @PostMapping
    @PutMapping
    public String set(@RequestParam String newText) {
        temp += newText;
        return temp;
    }

    @DeleteMapping
    public String delete() {
        this.temp = "";
        return temp;
    }
}
