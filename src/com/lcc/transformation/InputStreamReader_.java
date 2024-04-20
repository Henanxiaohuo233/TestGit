package com.lcc.transformation;

import java.io.*;

/**
 * 演示使用 InputStreamReader 转换解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流 InputStreamReader.指定编码gbk/UTF-8
 * **/

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //读取d:\\a.txt(ANSI编码)
        String filePath = "d:\\a.txt";
        //1.把FileInputStream转成InputStreamReader
        //2.制定编码 gbK
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //3.把InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);
        //把2步和第3步写下一起。
        BufferedReader br = new BufferedReader(new InputStreamReader(
                                                    new FileInputStream(filePath), "gbk"));
        //4.读取
        String s = br.readLine();
        System.out.println("读取：" + s);
        br.close();
    }
}
