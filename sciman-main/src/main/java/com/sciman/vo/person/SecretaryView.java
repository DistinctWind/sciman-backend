package com.sciman.vo.person;

import com.sciman.pojo.Secretary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretaryView {
    private Integer employeeId;
    private String name;
    private Integer gender;
    private Integer age;

    public SecretaryView(Secretary secretary) {
        this.employeeId = secretary.getEmployeeId();
        this.name = secretary.getName();
        this.gender = secretary.getGender();
        this.age = secretary.getAge();
    }
}
