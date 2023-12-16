package com.mycompany.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getPassword() {
        return password;
    }

    private long id;
    private String ownerName;
    private String ownerEmail;
    private String phone;
    private String password;

}
