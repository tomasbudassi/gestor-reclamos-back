package com.uda.gestorreclamos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "issue")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String status;
    private String description;
    private float lat;
    private float longt;

    @Column(length = 99999)
    private String imageUrl64;

    @ManyToOne
    @JoinColumn(name = "type_code_id")
    @JsonIgnore
    private IssueCode issueCode;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;
}
