package com.luv2code.springsecurityjwt.json;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
}