package com.app.financiera.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleModel {
    private Long id;
    private String name;
    private String description;
    private String status;
}
