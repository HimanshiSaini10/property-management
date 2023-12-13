package com.mycompany.propertymanagement.service.impl;

import com.mycompany.propertymanagement.converter.UserConverter;
import com.mycompany.propertymanagement.dto.UserDTO;
import com.mycompany.propertymanagement.entity.UserEntity;
import com.mycompany.propertymanagement.repository.UserRepository;
import com.mycompany.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDTO login(String email, String password) {

        return null;
    }

    @Override
    public UserDTO register(@RequestBody UserDTO userDTO) {
        UserEntity ue = userConverter.convertDtoToEntity(userDTO);
        ue = userRepository.save(ue);
        userDTO = userConverter.convertEntityToDto(ue);
        return  userDTO;
    }
}
