package cn.javacoder.springmvc.mybatis.impl;

import cn.javacoder.springmvc.mybatis.entity.User;
import cn.javacoder.springmvc.mybatis.service.ScanUserInfoService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/22
 * Time:19:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:etc/spring/spring-servlet.xml","classpath:etc/spring/spring-mybatis.xml"})
public class ScanUserInfoServiceImplTest {

    @Autowired
    private ScanUserInfoService scanUserInfoService;
    @Test
    public void testSelectUserById() throws Exception {
        User user = scanUserInfoService.selectUserById(4);
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void testInsertUser() throws Exception {
        User user = new User();
        user.setUserName("mtime");
        user.setPassword("mtime123456");
        String result = "";
        try{
            scanUserInfoService.insertUser(user);
            result = " OK!";
        }catch(Exception e){
            result = "Roll Back";
        }
        System.out.println(result);
    }
}