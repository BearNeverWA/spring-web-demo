package com.migu;

import com.migu.Test;
import com.migu.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/7.
 */
@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    /**
     * 查询所有人员信息
     * @return
     */
    @GetMapping(value = "/test")
    public List<Test> userList(){
        return testRepository.findAll();
    }
}
