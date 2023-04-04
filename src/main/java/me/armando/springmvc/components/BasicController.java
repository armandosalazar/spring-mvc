package me.armando.springmvc.components;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller() // Creamos un controlador
@RequestMapping("/basic")
public class BasicController {

    @GetMapping(path = {"/controller", "/hello"})
    public String controller() {
        return "index";
    }
}
