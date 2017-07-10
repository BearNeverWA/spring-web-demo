package com.migu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by Administrator on 2017/7/7.
 */
public interface TestQueryService{
    Page<Test> findBookNoCriteria(Integer page,Integer size);
}
