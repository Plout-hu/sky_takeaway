package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    void update(SetmealDTO setmealDTO);

    void saveWithDish(SetmealDTO setmealDTO);

    SetmealVO getById(Long id);

    void stopOrStrat(Integer status, Long id);

    void deleteBetch(List<Long> ids);
}
