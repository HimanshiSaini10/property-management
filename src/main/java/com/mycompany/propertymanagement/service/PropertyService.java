package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {

    public PropertyDTO saveProperty(PropertyDTO propertyDTO);
    public List<PropertyDTO> getAllProperties();
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
    public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId);
    public void deleteProperty(Long propertyId);

}
