package com.wangzefeng.controller;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.CommonService;
import com.wangzefeng.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangzefeng on 2019/6/5 0005.
 */
@Controller
public class BaseController {

    @Autowired
    protected HttpSession session;

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    @Autowired
    protected CommonService commonService;

    public SysUser getSysUser(){
        Object ouser = session.getAttribute(Constants.SESSION_USER);
        if(ouser!=null){
            return (SysUser)ouser;
        }else{
            return null;
        }
    }

    @InitBinder
    public void initDateBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }


}
