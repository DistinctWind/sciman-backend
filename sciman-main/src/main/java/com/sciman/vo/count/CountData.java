package com.sciman.vo.count;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountData {
    private Integer laboratory;
    private Integer researcher;
    private Integer secretary;
    private Integer venue;
    private Integer organization;
    private Integer project;
    private Integer contact;
    private Integer achievement;
}
