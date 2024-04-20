package com.lcc.homeworks;

import com.lcc.properties_.DogXiaoHei;

import java.io.*;
import java.util.Properties;

@SuppressWarnings({"all"})

public class HomeWorks03 {
    public static void main(String[] args) throws IOException {
        //创建文件
        Properties ppt = new Properties();
        ppt.setProperty("name", "tom");
        ppt.setProperty("age", "5");
        ppt.setProperty("color", "red");
        ppt.store(new FileOutputStream("src\\dog.properties"), null);
        System.out.println("dog.properties配置文件创建成功！");
        //读取文件
        Properties ppt1 = new Properties();
        ppt1.load(new FileReader("src\\dog.properties"));
        String name = ppt1.getProperty("name");
        String ageStr = ppt1.getProperty("age");
        int age = Integer.parseInt(ageStr);//将配置文件age(String)强制转为int类型
        String color = ppt1.getProperty("color");
        DogXiaoHei dogXiaoHei = new DogXiaoHei(name, age, color);
        System.out.println(dogXiaoHei.toString());

    }
}
