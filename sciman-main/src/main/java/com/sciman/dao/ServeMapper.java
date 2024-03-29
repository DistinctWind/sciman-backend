package com.sciman.dao;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ServeMapper {
    @Update("update serve set secretary_id = #{secretaryId} where laboratory_id = #{laboratoryId}")
    Integer modifyLabSecretary(
            Integer laboratoryId,
            Integer secretaryId
    );

    @Insert("insert into serve(laboratory_id, secretary_id) values(#{laboratoryId}, null)")
    Integer insertServePlaceHolderFor(
            Integer laboratoryId
    );

    @Select("select secretary_id from serve where laboratory_id = #{laboratoryId}")
    Long getLabSecretaryId(
            Long laboratoryId
    );

    @Delete("delete from serve where laboratory_id = #{laboratoryId}")
    Integer deleteServeRelationFor(
            Long laboratoryId
    );
}
