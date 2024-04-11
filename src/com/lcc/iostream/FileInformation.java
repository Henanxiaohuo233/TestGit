package com.lcc.iostream;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件信息

    @Test
    public void fileDemo() {
        File file = new File("d:\\news3.txt");

        //getName,getAbsolutePath,getParent,length,exists,isFile,isDirectory

        System.out.println("文件名字=" + file.getName());

        System.out.println("文件绝对路径=" + file.getAbsolutePath());

        System.out.println("文件父级目录=" + file.getParent());

        System.out.println("文件大小(字节)=" + file.length());

        System.out.println("文件是否存在=" + file.exists());

        System.out.println("是不是一个文件" + file.isFile());

        System.out.println("是不是一个目录=" + file.isDirectory());
    }
}
