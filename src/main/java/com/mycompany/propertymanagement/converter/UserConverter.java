package com.mycompany.propertymanagement.converter;

import com.mycompany.propertymanagement.dto.UserDTO;
import com.mycompany.propertymanagement.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDtoToEntity(UserDTO userDTO) {
        UserEntity pe = new UserEntity();
        pe.setOwnerEmail(userDTO.getOwnerEmail());
        pe.setPassword(userDTO.getPassword());
        pe.setOwnerName(userDTO.getOwnerName());
        pe.setPhone(userDTO.getPhone());
        return pe;
    }
    public UserDTO convertEntityToDto(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(userEntity.getId());
        userDTO.setOwnerEmail(userEntity.getOwnerEmail());
        userDTO.setOwnerName(userEntity.getOwnerName());
        userDTO.setPhone(userEntity.getPhone());

        return userDTO;
    }
}
