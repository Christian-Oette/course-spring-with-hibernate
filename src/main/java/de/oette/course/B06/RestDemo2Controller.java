package de.oette.course.B06;

import org.springframework.web.bind.annotation.*;

/**
 * Mac/Linux
 * curl -XPOST "localhost:8080"  -H "Content-Type: application/json" -d '{ "text" : "new" }'
 * curl -XPUT "localhost:8080"  -H "Content-Type: application/json" -d '{ "text" : "add" }'
 *
 * Windows
 * curl -XPOST "localhost:8080" -H "Content-Type: application/json" -d "{\"text\" : \"new\"}"
 * curl -XPOST "localhost:8080" -H "Content-Type: application/json" -d "{\"text\" : \"add\"}"
 */
@RestController
public class RestDemo2Controller {

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
