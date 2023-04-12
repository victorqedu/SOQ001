
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
    private final TestService service;

    @Autowired
    public TestRestController(TestService theService) {        service = theService;    }

    @PostMapping("/test")
    public String test(@RequestBody SearchTest object) {
        return service.test(object);
    }
}
