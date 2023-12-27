package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Venue;
import com.sciman.vo.venue.VenueView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VenueMapper {
    @Select("select * from venue")
    List<Venue> getAllVenue();

    Page<VenueView> getVenueViewFor(String laboratoryName);
}
