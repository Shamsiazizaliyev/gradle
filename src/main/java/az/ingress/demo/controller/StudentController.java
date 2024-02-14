package az.ingress.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/students")
public class StudentController {


    @GetMapping
    public String tets(){

        return "test";
    }
    @RequestMapping("test2")
    @GetMapping
    public String test2(){

        return "test2";
    }

    @RequestMapping("test3/{name}")
    @GetMapping
    public String test3(@PathVariable String name){

        return name;
    }

    @RequestMapping("test4")
    @PostMapping
    public String test4(@PathVariable String name){

        return name;
    }
}
