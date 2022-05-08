package com.uda.gestorreclamos.dtos;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.models.IssueType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IssueRequestDTO {

    @NotEmpty(message = "El estado del reclamo no puede estar vacio")
    private String status;

    private String description;

    @NotEmpty(message = "La latitud del reclamo no puede estar vacio")
    private String lat;

    @NotEmpty(message = "La longitud del reclamo no puede estar vacio")
    private String longt;

    private String imageUrl64;

    @NotNull(message = "El tipo del reclamo no puede estar vacio")
    private IssueType issueType;

    private Employee employee;

    private String observation;

    public static Issue toEntity(IssueRequestDTO issueDto) {
        return Issue.builder()
                .status(issueDto.getStatus())
                .description(issueDto.getDescription())
                .lat(issueDto.getLat())
                .longt(issueDto.getLongt())
                .issueType(issueDto.getIssueType())
                .employee(issueDto.getEmployee())
                .observation(issueDto.getObservation())
                .build();
    }
}
