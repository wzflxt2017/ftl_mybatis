package com.wangzefeng.service;

import com.wangzefeng.pojo.SysUser;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
public interface UserService {
    int save(SysUser sysUser);
    int update(SysUser sysUser);
    SysUser selectById(String sysUserId);
    SysUser selectByUserName(String userName);
}
