package com.cnc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhengkai23919@hundsun.com
 * @Versioon 1.0
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello " + name + "，this is product 2 send first message";
    }
}
