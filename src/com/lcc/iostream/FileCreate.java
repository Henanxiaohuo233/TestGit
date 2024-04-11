package com.lcc.iostream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

@SuppressWarnings({"all"})
public class FileCreate {
    public static void main(String[] args) {
        //方式1
    }
    @Test
    public void create01() {
        String filePath = "d:\\news.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\news2.txt
    @Test
    public void create02() {
        File parentFile = new File("d:\\");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();//只有执行了createNewFile方法真正创建对象语句
            System.out.println("文件2创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //第三种方式 new File(String parent,String child)//根据父目录+子路径构建
    @Test
    public void create03() {
        //String parentPath = "d:/";//True
        String parentPath = "d:\\";//True
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
