package com.ia.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/main")
    public String mainPage() {
        return "main";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    @GetMapping("/signin")
    public String signinPage() {
        return "signin";
    }

    @GetMapping("/store")
    public String storePage() {
        return "store";
    }


    @GetMapping("/forgot-password")
    public String forgotpasswordPage() {
        return "forgotpassword";
    }



}
