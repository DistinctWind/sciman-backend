package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Secretary;
import com.sciman.vo.person.SecretaryView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SecretaryMapper {
    @Select("select * from secretary")
    List<Secretary> getAllSecretary();

    @Select("select * from secretary where employee_id = #{employeeId}")
    Secretary getSecretaryById(Long employeeId);

    Page<SecretaryView> getSecretaryFor(
            String nameFilter
    );

    Integer updateSecretary(Secretary secretary);

    @Delete("delete from secretary where employee_id = #{employeeId}")
    Integer deleteSecretaryById(Long employeeId);
}
