package com.ia.server;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;
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
    public String forgotPasswordPage() {
        return "forgotpassword";
    }


    @PostMapping("/signup/post")
    public String signupPostPage(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "email") String email,
                                 @RequestParam(value = "password") String password,
                                 @RequestParam(value = "confirmPassword") String confirmPassword) {

        String result = mainService.signup(name, email, password, confirmPassword);
        return result;
    }

    @PostMapping("/login/post")
    public String loginPostPage (@RequestParam(value = "email") String email,
                                 @RequestParam(value = "password") String password) {

        String result = mainService.login(email, password);
        return result;


    }}
