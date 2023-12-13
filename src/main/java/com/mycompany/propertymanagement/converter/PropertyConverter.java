package com.mycompany.propertymanagement.converter;

import com.mycompany.propertymanagement.dto.PropertyDTO;
import com.mycompany.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDtoToEntity(PropertyDTO propertyDTO) {
        PropertyEntity pe = new PropertyEntity();

        pe.setAddress(propertyDTO.getAddress());
        pe.setPrice(propertyDTO.getPrice());
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());

        return pe;
    }

    public PropertyDTO convertEntityToDto(PropertyEntity propertyEntity) {
        PropertyDTO propertyDTO = new PropertyDTO();

        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setDescription(propertyEntity.getDescription());

        return propertyDTO;
    }

}
