package com.lcc.homeworks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
@SuppressWarnings({"all"})
public class HomeWorks01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "d:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("文件" + file + "创建成功！");
            } else {
                System.out.println("文件" + file + "创建失败");
            }
        }else {
            System.out.println("文件" + file + "已经存在!");
        }

        String filePath = directoryPath + "\\hello.txt";
        File file1 = new File(filePath);
        if (!file1.exists()) {
            //创建文件
            if (file1.createNewFile()) {
                System.out.println("文件" + filePath + "创建成功");
                BufferedWriter bt = new BufferedWriter(new FileWriter(filePath));
                bt.write("hello word!");
                bt.close();
            }else {
                System.out.println("文件" + file + "创建失败");
            }
        } else {
            System.out.println("文件" + file1 + "已经存在!");
        }


    }
}
