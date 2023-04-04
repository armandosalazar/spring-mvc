package me.armando.springmvc.components;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/basic")
public class BasicController {

    @GetMapping(path = {"/controller", "/helloworkd"})
    public String controller() {
        return "index";
    }
}
