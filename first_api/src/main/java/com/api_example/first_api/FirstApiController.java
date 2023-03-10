package com.api_example.first_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstApiController {
    @ResponseBody
    @RequestMapping("/welcome")
    public String firstApi()
    {
        return "my first api";
    }
}
