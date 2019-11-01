package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangzhineng
 * @date 2019-10-25 - 13:53
 */
@Controller
public class QuickController {


    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("now","now");
        return "hello";
    }

}
