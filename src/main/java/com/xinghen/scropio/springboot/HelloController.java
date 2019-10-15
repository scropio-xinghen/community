package com.xinghen.scropio.springboot;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author 赵炳程
 * @version 1.0
 */
@Controller
public class HelloController {
   @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
   }

}
