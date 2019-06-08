package de.oette.course.B06;

import org.springframework.web.bind.annotation.*;

/**
 * curl -XPOST "localhost:8080"  -H "Content-Type: application/json" -d '{ "text" : "new" }'
 * curl -XPUT "localhost:8080"  -H "Content-Type: application/json" -d '{ "text" : "add" }'
 */
@RestController
public class RestDemo2Controller {

    private Data temp = new Data();

    @GetMapping
    public Data get() {
        return temp;
    }

    @PostMapping
    public Data set(@RequestBody Data newData) {
        temp = newData;
        return temp;
    }

    @PutMapping
    public Data add(@RequestBody Data newData) {
        temp.text += newData.text;
        return temp;
    }

    @DeleteMapping
    public Data delete() {
        this.temp = new Data();
        return temp;
    }

    public static class Data {
        public String text;
    }
}
