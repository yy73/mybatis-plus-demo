package com.yy.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yy.mybatis.domain.TSscBasicDailyStation;

import java.util.List;

/**
 * @Author ywl
 * @Date 2021/6/23 15:51
 * @Description
 */
public interface TSscBasicDailyStationMapper extends BaseMapper<TSscBasicDailyStation> {

    IPage<TSscBasicDailyStation> selectPage(Page<TSscBasicDailyStation> page);

    List<TSscBasicDailyStation> getAll();
}
