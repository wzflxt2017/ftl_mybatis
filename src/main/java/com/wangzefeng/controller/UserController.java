package com.wangzefeng.controller;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.UserService;
import com.wangzefeng.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/modifyInfo")
    public String modifyInfo(SysUser sysUser){
        int update = userService.update(sysUser);
        if(update==1){
            session.setAttribute(Constants.SESSION_USER,userService.selectById(sysUser.getSysUserId()));
        }
        return "sss";
    }

}
