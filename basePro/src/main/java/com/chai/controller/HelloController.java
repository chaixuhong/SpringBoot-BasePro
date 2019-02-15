package com.chai.controller;

import com.chai.service.HelloService;
import com.chai.utils.ResponseUtils;
import com.chai.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chaizi
 */
@RestController
@RequestMapping("/wx")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/haha")
    public ResultVO test(){
        System.out.println("方法执行中");
        helloService.save("hahahaha");
        return ResponseUtils.success();
    }
}
