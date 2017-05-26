package com.example.demo.Controller;

import com.example.demo.User;
import com.example.demo.View;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liushenen on 2017/5/24.
 */
@RestController
public class UserContro {
    @RequestMapping(value = "/",method ={RequestMethod.POST,RequestMethod.GET,})
    @ResponseBody
    @JsonView(View.NameAndId.class)
    User home() {
        return new User("我","123","123456");
    }

}
