package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Laboratory;
import com.sciman.vo.lab.LaboratoryView;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LabMapper {
    @Select("select * from laboratory")
    List<Laboratory> getAllLabs();

    @Delete("delete from laboratory where id = #{id}")
    Integer delete(Long id);

    List<LaboratoryView> queryLabIntros(
            String nameFilter
    );

    Page<LaboratoryView> listLaboratoryViewFor(
            String nameFilter
    );

    @Select("select orientation from laboratory where id = #{id}")
    String queryOrientationOfLabId(Long id);

    Integer insert(Laboratory laboratory);
}
