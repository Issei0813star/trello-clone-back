package org.app.trellocloneback.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.app.trellocloneback.dto.UserDto;
import org.app.trellocloneback.entity.UserEntity;
import org.app.trellocloneback.repository.UserRepository;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;

    public UserEntity createUser(UserDto dto){
        UserEntity entity = new UserEntity();
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());

        return userRepository.save(entity);
    }

}
