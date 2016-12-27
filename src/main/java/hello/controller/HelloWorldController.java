package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jinwoo on 2016. 12. 28..
 */

@Controller
public class HelloWorldController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "welcome";
    }
}
