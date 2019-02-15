package com.chai.service.imp;

import com.chai.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Auther: chaizi
 */
@Service
public class HelloServiceImp implements HelloService {
    @Override
    public void save(String args) {
        System.out.println("保存数据" + args);
    }
}
