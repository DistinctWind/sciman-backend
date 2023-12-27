package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Researcher;
import com.sciman.vo.person.ResearcherView;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface ResearcherMapper {
    List<ResearcherView> listAllResearcherView(Long laboratoryId);

    Page<ResearcherView> listResearcherView(
            String nameFilter,
            String laboratoryNameFilter
    );

    @Select("select * from researcher where employee_id = #{id}")
    Researcher getResearcherId(Long id);

    int updateResearcher(Researcher researcher);

    @Delete("delete from researcher where employee_id = #{id}")
    int deleteResearcher(Long id);

    int insertResearcher(Researcher researcher);

    @Delete("delete from researcher where laboratory_id = #{labId}")
    int deleteResearcherByLabId(Long labId);
}
