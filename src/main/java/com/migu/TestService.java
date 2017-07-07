package com.migu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by Administrator on 2017/7/7.
 */
public class TestService {

    @Autowired
    private TestRepository testRepository;
    public Page<Test> getTest(int pageNumber,int pageSize){
        PageRequest request=buildPageRequest
    }
}
