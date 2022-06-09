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
    private String token;

    public EmployeeLoginDTO(Integer id, String token) {
        this.id = id;
        this.token = token;
    }
}
