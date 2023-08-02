package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<Long> getSetmealByDishIds(List< Long > dishIds);
    @Delete("delete from sky_take_out.setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);
    void insertBatch(List<SetmealDish> setmealDishes);
    @Select("select * from sky_take_out.setmeal_dish where setmeal_id=#{setmealId}")
    List<SetmealDish> getSetmealId(Long setmealId);
}
