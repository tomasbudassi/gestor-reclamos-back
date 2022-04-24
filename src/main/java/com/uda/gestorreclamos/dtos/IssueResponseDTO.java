package com.uda.gestorreclamos.dtos;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.models.IssueType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IssueResponseDTO {

    private Integer id;
    private String status;
    private String description;
    private float lat;
    private float longt;
    private IssueType issueType;
    private Employee employee;

    public static IssueResponseDTO toMap(Issue issue) {
        return IssueResponseDTO.builder()
                .id(issue.getId())
                .status(issue.getStatus())
                .description(issue.getDescription())
                .lat(issue.getLat())
                .longt(issue.getLongt())
                .issueType(issue.getIssueType())
                .employee(issue.getEmployee())
                .build();
    }
}
