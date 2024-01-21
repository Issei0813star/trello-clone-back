package org.app.trellocloneback.controller;

import org.app.trellocloneback.dto.LoginRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDto dto) {
        //TODO ログイン機能
        return "TODO";
    }
}
