package com.sciman.dto.secretary;

import com.sciman.vo.person.SecretaryView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretaryViewQueryResult {
    private List<SecretaryView> secretaries;
    private Long total;
}
