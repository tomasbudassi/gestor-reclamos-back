package com.uda.gestorreclamos.dtos;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.models.IssueType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.util.Objects.nonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueUpdateRequestDTO {

    private String status;
    private String description;
    private String lat;
    private String longt;
    private String imageUrl64;
    private IssueType issueType;
    private Employee employee;
    private String observation;

    public static Issue toEntity(Issue issue, IssueUpdateRequestDTO issueDto) {
        if(nonNull(issueDto.getStatus())) issue.setStatus(issueDto.getStatus());
        if(nonNull(issueDto.getDescription())) issue.setDescription(issueDto.getDescription());
        if(nonNull(issueDto.getLat())) issue.setLat(issueDto.getLat());
        if(nonNull(issueDto.getLongt())) issue.setLongt(issueDto.getLongt());
        if(nonNull(issueDto.getIssueType())) issue.setIssueType(issueDto.getIssueType());
        if(nonNull(issueDto.getEmployee())) issue.setEmployee(issueDto.getEmployee());
        if(nonNull(issueDto.getObservation())) issue.setObservation(issueDto.getObservation());
        if(nonNull(issueDto.getImageUrl64())) issue.setImageUrl64(issueDto.getImageUrl64());
        return issue;
    }
}
