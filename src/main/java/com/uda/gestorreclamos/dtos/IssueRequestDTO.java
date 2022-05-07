package com.uda.gestorreclamos.dtos;

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

    private Integer id;

    @NotEmpty(message = "El estado del reclamo no puede estar vacio")
    private String status;

    @NotEmpty(message = "La descripcion del reclamo no puede estar vacio")
    private String description;

    @NotEmpty(message = "La latitud del reclamo no puede estar vacio")
    private String lat;

    @NotEmpty(message = "La longitud del reclamo no puede estar vacio")
    private String longt;

    private String imageUrl64;

    @NotNull(message = "El reclamo debe tener un estado")
    private IssueType issueType;

    public static Issue toEntity(IssueRequestDTO issueDto) {
        return Issue.builder()
                .id(issueDto.getId())
                .status(issueDto.getStatus())
                .description(issueDto.getDescription())
                .lat(issueDto.getLat())
                .longt(issueDto.getLongt())
                .issueType(issueDto.getIssueType())
                .build();
    }
}
