package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Venue;
import com.sciman.vo.venue.VenueView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VenueMapper {
    @Select("select * from venue")
    List<Venue> getAllVenue();

    Page<VenueView> getVenueViewFor(
            String laboratoryNameFilter,
            String addressFilter
    );

    @Select("select * from venue where id = #{venueId}")
    Venue getVenueById(Long venueId);

    Integer updateVenue(Venue venue);

    @Delete("delete from venue where id = #{venueId}")
    Integer deleteVenueById(Long venueId);
}
