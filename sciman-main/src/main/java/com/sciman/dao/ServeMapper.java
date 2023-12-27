package com.sciman.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ServeMapper {
    @Update("update serve set secretary_id = #{secretaryId} where laboratory_id = #{laboratoryId}")
    Integer modifyLabSecretary(
            Integer laboratoryId,
            Integer secretaryId
    );
}
