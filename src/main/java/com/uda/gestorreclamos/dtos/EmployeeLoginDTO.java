package com.uda.gestorreclamos.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeLoginDTO {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String type;
    private String token;
}
