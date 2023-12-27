package com.sciman.dto.laboratory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaboratorySecretaryModifyParam {
    private Integer laboratoryId;
    private Integer secretaryId;
}
