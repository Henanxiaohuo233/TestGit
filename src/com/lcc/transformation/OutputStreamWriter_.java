package com.lcc.transformation;

import java.io.*;

/**
 * 演示 OutputStreamWriter使用
 * 把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8
 * **/
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\lcc.txt";
        String charSet = "UTF-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("你好，李某人");
        osw.close();
        System.out.println("按照" + charSet + "保存文件成功");
        //PrintStream
        //PrintWriter
    }
}
