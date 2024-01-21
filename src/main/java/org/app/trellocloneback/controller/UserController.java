package org.app.trellocloneback.controller;

import lombok.RequiredArgsConstructor;
import org.app.trellocloneback.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.app.trellocloneback.dto.UserDto;
import org.app.trellocloneback.service.UserService;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserDto dto){
        return userService.createUser(dto);
    }
}
