package com.uda.gestorreclamos.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    private String username;

    @JsonIgnore
    private String password;

    private String name;
    private String lastname;
    private String type;

    @OneToMany(mappedBy="employee")
    @JsonIgnore
    private Set<Issue> issues;
}
