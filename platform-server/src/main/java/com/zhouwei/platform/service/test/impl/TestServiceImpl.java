package com.zhouwei.platform.service.test.impl;

import com.zhouwei.platform.bean.test.Test;
import com.zhouwei.platform.mapper.test.TestMapper;
import com.zhouwei.platform.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhouwei on 2017/3/6.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    public Test selectById(String id) {
        Test test = testMapper.selectById(id);
        return test;
    }
}
