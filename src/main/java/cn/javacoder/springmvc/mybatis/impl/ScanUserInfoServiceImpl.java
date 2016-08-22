package cn.javacoder.springmvc.mybatis.impl;

import cn.javacoder.springmvc.mybatis.dao.ScanUserInfoDao;
import cn.javacoder.springmvc.mybatis.dao.ScanUserInfoMapperDao;
import cn.javacoder.springmvc.mybatis.entity.User;
import cn.javacoder.springmvc.mybatis.service.ScanUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:17:14
 */

@Component
public class ScanUserInfoServiceImpl implements ScanUserInfoService {

    @Autowired
    private ScanUserInfoDao scanUserInfoDao;

    @Override
    public User selectUserById(int userId) {
        return scanUserInfoDao.selectUserById(userId);
    }

    @Override
    public void insertUser(User user) {
        scanUserInfoDao.insertUser(user);
    }
}
