package com.lcc.iostream;

import org.junit.jupiter.api.Test;

import java.io.*;

@SuppressWarnings({"all"})

public class Directory_ {
    public static void main(String[] args) {
        String filePath = "D:\\";
        String fileName = "demo02";
        File file = new File(filePath, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void m1() {
        String filePath = "d:\\news3.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("news3-删除成功-");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    //体会到java编程中，目录 也被当做文件。
    @Test
    public void m2() {
        String filePath = "d:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("demo02-删除成功-");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }
    }

    @Test
    public void m3() {
        String directoryPath = "D:\\demo\\a\\b\\c";//多级目录
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println("该目录存在");
        } else {
            if (file.mkdirs()) { //返回boolean-创建一级目录使用mkdir，多级mkdirs
                System.out.println(directoryPath+"该目录创建成功");
            } else {
                System.out.println(directoryPath+"该目录创建失败");
            }
        }


    }
}
