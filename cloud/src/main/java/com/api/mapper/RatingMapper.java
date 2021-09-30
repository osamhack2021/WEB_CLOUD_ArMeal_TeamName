package com.api.mapper;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.api.domain.Rating;
import com.api.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RatingMapper {
    void addRating(@Param("_userId")long userId, @Param("_menuId")long menuId, @Param("ratingData")int ratingData);
    void updateBadReason(@Param("_badreason") int badReason);
    List<HashMap<String, Object>> getAllRating();
    List<HashMap<String, Object>> getRatioByDates(@Param("_start") Date start, @Param("_end") Date end);
    List<HashMap<String, Object>> getBadReasonByMenuId(@Param("_id")long id);
    List<HashMap<String, Object>> findRatioOfAllMenu();
    
    void calcSumOfRating_data();
}