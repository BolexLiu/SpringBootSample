package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liushenen on 2017/5/24.
 */
@SpringBootApplication
public class SampleController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }


}
