package br.edu.springdatanosql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Value("${spring.application.name}")
    String name;

    @Value("${spring.application.active.profile}")
    String activeProfile;

    @GetMapping
    public String hello() {
        return name + " || " + activeProfile;
    }
}
