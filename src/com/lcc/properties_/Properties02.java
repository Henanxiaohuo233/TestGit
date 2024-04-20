package com.lcc.properties_;

import java.io.*;
import java.io.IOException;
import java.util.Properties;
/**
 * 演示Properties类的读取
 * **/

public class Properties02 {
    public static void main(String[] args) throws Exception {
        //使用Properties类 来读取mysql.properties文件

        //1.创建Properties对象
        Properties ppt = new Properties();
        //2.加载指定配置文件
        ppt.load(new FileReader("src\\mysql.properties"));
        //3.把k-v显示在控制台
        ppt.list(System.out);
        //4.根据key来获取相应的数值
        String user = ppt.getProperty("user");
        String pwd = ppt.getProperty("pwd");
        System.out.println("用户名是" + user);
        System.out.println("密码是" + pwd);
    }
}
