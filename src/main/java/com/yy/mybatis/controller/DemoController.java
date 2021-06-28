package com.yy.mybatis.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yy.mybatis.domain.TSscBasicDailyStation;
import com.yy.mybatis.mapper.TSscBasicDailyStationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ywl
 * @Date 2021/6/23 15:48
 * @Description
 */
@RestController
public class DemoController {

    @Autowired
    private TSscBasicDailyStationMapper tSscBasicDailyStationMapper;

    @GetMapping("/demo")
    public String demo() {
        return "hello mybatis-plus";
    }

    @GetMapping("/demo2")
    public List<TSscBasicDailyStation> demo2() {
        List<TSscBasicDailyStation> tSscBasicDailyStations = tSscBasicDailyStationMapper.selectList(null);
        return tSscBasicDailyStations;
    }

    @GetMapping("/demo3")
    public List<TSscBasicDailyStation> demo3() {

        QueryWrapper<TSscBasicDailyStation> qw = new QueryWrapper<>();
        qw.eq("id", "0031e7e0b34c456da775a71395887de0");
        List<TSscBasicDailyStation> tSscBasicDailyStations = tSscBasicDailyStationMapper.selectList(qw);

        return tSscBasicDailyStations;
    }

    @GetMapping("/demo4")
    public List<TSscBasicDailyStation> demo4() {
        LambdaQueryWrapper<TSscBasicDailyStation> lq = new LambdaQueryWrapper<>();
        lq.eq(TSscBasicDailyStation::getId, "0031e7e0b34c456da775a71395887de0");
        List<TSscBasicDailyStation> tSscBasicDailyStations = tSscBasicDailyStationMapper.selectList(lq);
        return tSscBasicDailyStations;
    }

    @GetMapping("/demo5")
    public List<TSscBasicDailyStation> demo5() {
        LambdaQueryWrapper<TSscBasicDailyStation> lq = new LambdaQueryWrapper<>();
        lq.like(TSscBasicDailyStation::getWorkPosition, "电缆")
                .eq(TSscBasicDailyStation::getSafeName, "方敏")
                .last(true, "limit 1");
        List<TSscBasicDailyStation> tSscBasicDailyStations = tSscBasicDailyStationMapper.selectList(lq);
        return tSscBasicDailyStations;
    }

    @GetMapping("/demo6")
    public Page<TSscBasicDailyStation> demo6() {
        LambdaQueryWrapper<TSscBasicDailyStation> lq = new LambdaQueryWrapper<>();
        lq.like(TSscBasicDailyStation::getWorkPosition, "电缆");
        Page<TSscBasicDailyStation> page = new Page<>();
        page.setSize(2);
        page.setCurrent(1);
        Page<TSscBasicDailyStation> tSscBasicDailyStationPage = tSscBasicDailyStationMapper.selectPage(page, lq);
        return tSscBasicDailyStationPage;
    }

    @GetMapping("/demo7")
    public List<TSscBasicDailyStation> demo7() {
        return tSscBasicDailyStationMapper.getAll();
    }
}
