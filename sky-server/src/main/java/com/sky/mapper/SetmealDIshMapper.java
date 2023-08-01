package com.sky.mapper;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDIshMapper {
    List<Long> getSetmealByDishIds(List< Long > dishIds);

}
