package com.its.helloutente;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/demo")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("{nome}")
    public String hello(@PathVariable String nome) {
        return "Hello" + nome;
    }

    @GetMapping("/params")
    public String helloParams(@RequestParam String nome) {
        return "Hello" + nome;
    }

}
