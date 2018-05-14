package org.yunfan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/3 0003.
 */
@RestController
@RequestMapping("/deam")
public class Deam {

    @RequestMapping("/say")
    public String say(){
        return "hello world!!!";
    }
}
