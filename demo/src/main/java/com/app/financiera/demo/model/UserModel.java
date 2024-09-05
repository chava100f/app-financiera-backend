package com.app.financiera.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {
    private String name;
    private String email;
    private String password;
    private String role;
    private String token;
}
