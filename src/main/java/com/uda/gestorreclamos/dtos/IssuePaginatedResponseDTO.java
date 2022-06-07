package com.uda.gestorreclamos.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IssuePaginatedResponseDTO {

    @JsonProperty("max_pages")
    private int maxPages;

    private List<IssueResponseDTO> issues;
}
