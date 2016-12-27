package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jinwoo on 2016. 12. 28..
 */

@RestController
public class HelloWorldRestController {
    @RequestMapping(path = "/rest/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello, Jade";
    }
}
