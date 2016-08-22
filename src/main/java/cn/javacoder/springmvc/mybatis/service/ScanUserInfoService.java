package cn.javacoder.springmvc.mybatis.service;

import cn.javacoder.springmvc.mybatis.entity.User;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:17:14
 */
public interface ScanUserInfoService {
    User selectUserById(int userId);

    void insertUser(User user);
}
