package com.uda.gestorreclamos.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "issue")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;
    private String description;
    private String lat;
    private String longt;

    @Column(length = 99999)
    private String imageUrl64;

    private String observation;

    private String creation_date;

    @ManyToOne
    @JoinColumn(name = "type_id")
    @JsonIgnoreProperties("issues")
    private IssueType issueType;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnoreProperties("issues")
    private Employee employee;

}
