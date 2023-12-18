package com.mycompany.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private long id;
    private String ownerName;
    @NotNull(message = "Email can not be initial")
    private String ownerEmail;
    private String phone;
    @NotNull(message = "Password can not be null")
    @NotEmpty(message = "Password can not be empty")
    private String password;

}
