package com.wangzefeng.interceptor;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.tools.Constants;
import com.wangzefeng.tools.ValidateUtil;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangzefeng on 2019/6/4 0004.
 */
public class CommonInterceptor implements HandlerInterceptor {

    private final Logger logger=Logger.getLogger(CommonInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        Object ouser = httpServletRequest.getSession().getAttribute(Constants.SESSION_USER);
//        if(ouser==null){
//            httpServletResponse.sendRedirect("/home/toLogin");
//            return false;
//        }else{
//            SysUser sysUser = (SysUser) ouser;
//            if(!ValidateUtil.validateString(sysUser.getSysUserId())){
//                httpServletResponse.sendRedirect("/home/toLogin");
//                return false;
//            }else{
//                logger.info("当前用户："+sysUser.toString());
//            }
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
