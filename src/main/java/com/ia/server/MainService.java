package com.ia.server;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final UserRepository userRepository;
    public String signup(String name, String email, String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            return "redirect:/signup";
        }


        User user = User.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();

        userRepository.save(user);

            return "redirect:/main";
    }

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            return "redirect:/signup";
        }

        if (user.getPassword().equals(password)) {
            return "redirect:/main";
        }

        return "redirect:/signin";
    }
}
