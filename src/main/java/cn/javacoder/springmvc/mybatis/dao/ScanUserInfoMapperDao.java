package cn.javacoder.springmvc.mybatis.dao;

import cn.javacoder.springmvc.mybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:17:19
 */
@Repository
public interface ScanUserInfoMapperDao {
    User selectUserById(int userId);

    void insertUser(User user);
}
