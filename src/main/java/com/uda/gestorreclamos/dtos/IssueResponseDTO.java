package com.uda.gestorreclamos.dtos;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.models.IssueType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IssueResponseDTO {

    private Integer id;
    private String status;
    private String description;
    private BigDecimal lat;
    private BigDecimal longt;
    private IssueType issueType;
    private Employee employee;
    private String observation;
    private String creation_date;
    private String imageUrl64;

    public static IssueResponseDTO toDto(Issue issue) {
        return IssueResponseDTO.builder()
                .id(issue.getId())
                .status(issue.getStatus())
                .description(issue.getDescription())
                .lat(new BigDecimal(issue.getLat()))
                .longt(new BigDecimal(issue.getLongt()))
                .issueType(issue.getIssueType())
                .employee(issue.getEmployee())
                .observation(issue.getObservation())
                .creation_date(issue.getCreation_date())
                .imageUrl64(issue.getImageUrl64())
                .build();
    }
}
