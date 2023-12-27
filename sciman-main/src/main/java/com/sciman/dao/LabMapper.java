package com.sciman.dao;

import com.sciman.pojo.Laboratory;
import com.sciman.vo.lab.LaboratoryView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LabMapper {
    @Select("select * from laboratory")
    List<Laboratory> getAllLabs();

//    @Select("select lab.id, lab.name laboratory_name, r.name stuff_name, secretary.name secretary_name from\n" +
//            "laboratory lab join staff stuff on lab.id = stuff.id\n" +
//            "join researcher r on stuff.researcher_id = r.employee_id\n" +
//            "join serve on lab.id = serve.laboratory_id\n" +
//            "join secretary on serve.secretary_id = secretary.employee_id")
//    List<LaboratoryIntroduction> queryLabIntros();

    @Delete("delete from laboratory where id = #{id}")
    Integer delete(Integer id);

    List<LaboratoryView> queryLabIntros(String nameFilter);
}
