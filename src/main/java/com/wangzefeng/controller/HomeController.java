package com.wangzefeng.controller;

import com.wangzefeng.pojo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzefeng on 2019/5/31 0031.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        SysUser sysUser=new SysUser();
        sysUser.setSysUserId("sssss");
        System.out.println(sysUser);
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "page-login";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "page-register";
    }
}
