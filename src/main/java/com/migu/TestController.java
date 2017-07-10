package com.migu;

import com.migu.Test;
import com.migu.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/7.
 */
@Controller
@RequestMapping(value = "/query")
public class TestController {

    @Autowired
    TestQueryService testQueryService;

    @RequestMapping("/test")
    public String findTestNoQuery(ModelMap modelMap, @RequestParam(value = "/page",defaultValue = "/0")Integer page,@RequestParam(value = "/size",defaultValue = "/5")Integer size){
        Page<Test> datas=testQueryService.findBookNoCriteria(page,size);
        modelMap.addAttribute("datas",datas);
        return "index1";
    }

}
