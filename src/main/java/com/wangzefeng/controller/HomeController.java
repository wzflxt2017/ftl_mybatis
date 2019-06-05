package com.wangzefeng.controller;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangzefeng on 2019/5/31 0031.
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController{

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView view){
        view.setViewName("index");
        SysUser sysUser = getSysUser();
        if(sysUser!=null){
            view.addObject("sysUser",sysUser);
        }
        return view;
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "page-login";
    }

    @ResponseBody
    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public String login(SysUser sysUser){
        System.out.println(sysUser);
        return "1";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "page-register";
    }
}
