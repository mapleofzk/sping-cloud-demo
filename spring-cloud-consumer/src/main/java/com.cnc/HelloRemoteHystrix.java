package com.cnc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zhengkai23919@hundsun.com
 * @Versioon 1.0
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam String name) {
        return "hello" +name+", this messge send failed ";
    }
}
