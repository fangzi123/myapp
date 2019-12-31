package com.wdcloud.myapp.controller;

import com.wdcloud.myapp.mapper.WdUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangff
 * @date 2019/12/31 13:56
 */
@RestController
public class TestController {
    @Autowired
    private WdUserMapper wdUserMapper;

    @GetMapping("/test")
    public List get(){
        return wdUserMapper.selectAll();
    }
}
