package com.wangzefeng.service.impl;

import com.wangzefeng.dao.SysUserMapper;
import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.UserService;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int save(SysUser sysUser) {
        if(!ValidateUtil.validateString(sysUser.getSysUserId())){
            sysUser.setSysUserId(ValidateUtil.getUUid());
        }
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int update(SysUser sysUser) {
        SysUser sysUser1 = sysUserMapper.selectByPrimaryKey(sysUser.getSysUserId());
        sysUser1.setFullName(sysUser.getFullName());
        sysUser1.setUserBirthday(sysUser.getUserBirthday());
        sysUser1.setUserEmail(sysUser.getUserEmail());
        sysUser1.setUserSign(sysUser.getUserSign());
        sysUser1.setUserPhone(sysUser.getUserPhone());
        return sysUserMapper.updateByPrimaryKey(sysUser1);
    }

    @Override
    public SysUser selectById(String sysUserId) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(sysUserId);
        return sysUser;
    }

    @Override
    public SysUser selectByUserName(String userName) {
        SysUser sysUser = sysUserMapper.selectByUserName(userName);
        return sysUser;
    }
}
