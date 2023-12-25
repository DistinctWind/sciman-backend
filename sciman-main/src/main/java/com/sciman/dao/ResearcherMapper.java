package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.vo.person.ResearcherView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ResearcherMapper {
    @Select("select employee_id, l.name laboratory_name, r.name as name, gender, age\n" +
            "    from researcher r join laboratory l on r.laboratory_id = l.id ")
    List<ResearcherView> listAllResearcherView();

    Page<ResearcherView> listResearcherView(
            String nameFilter
    );
}
