package cn.javacoder.springmvc.mybatis.dao;

import cn.javacoder.springmvc.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:17:10
 */
@Repository
public class ScanUserInfoDao {

    @Autowired
    private ScanUserInfoMapperDao scanUserInfoMapperDao;

    public User selectUserById(int userId){
        return  scanUserInfoMapperDao.selectUserById(userId);
    }

    @Transactional("txManager")
    public void insertUser(User user) {
        scanUserInfoMapperDao.insertUser(user);
        throw new RuntimeException();
    }
}
