package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

//    @GetMapping("hello")
//    public String hello(Model model) {
//        System.out.println("/happy 요청");
//        model.addAttribute("data", "happy");
//        return "hello";
//    }
//    @GetMapping("hello2")
//    public String hello2() {
//        System.out.println("hello2 요청");
//        return "hello22";
//    }
    @GetMapping("/finaltest")
    public String greeting() {
        return "finaltest";
    }
}
