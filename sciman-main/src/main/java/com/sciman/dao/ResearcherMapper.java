package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Researcher;
import com.sciman.vo.person.ResearcherView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ResearcherMapper {
    @Select("select employee_id, l.name laboratory_name, r.name as name, gender, age\n" +
            "    from researcher r join laboratory l on r.laboratory_id = l.id ")
    List<ResearcherView> listAllResearcherView();

    Page<ResearcherView> listResearcherView(
            String nameFilter,
            String laboratoryNameFilter
    );

    @Select("select * from researcher where employee_id = #{id}")
    Researcher getResearcherId(Long id);

    int updateResearcher(Researcher researcher);
}
