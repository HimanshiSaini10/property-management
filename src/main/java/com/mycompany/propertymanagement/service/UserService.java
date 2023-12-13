package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.UserDTO;

public interface UserService {

    public UserDTO login(String email, String password);
    public UserDTO register(UserDTO userDTO);
}
