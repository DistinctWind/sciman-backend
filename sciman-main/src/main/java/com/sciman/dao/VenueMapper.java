package com.sciman.dao;

import com.sciman.pojo.Venue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VenueMapper {
    @Select("select * from venue")
    List<Venue> getAllVenue();
}
