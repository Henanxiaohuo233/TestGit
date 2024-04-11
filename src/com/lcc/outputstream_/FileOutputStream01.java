package com.lcc.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings({"all"})

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeStream() {
        String filePth = "d:\\hello.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //第一种
                //构造器有两种情况
                // 1. new FileOutputStream(filePth); 创建方式，当写入内容是，会覆盖原来的内容。
                // 2. new FileOutputStream(filePth, true); 创建方式，当写入内容是，是append追加到文件后面。
            fileOutputStream = new FileOutputStream(filePth, true);
            //fileOutputStream.write('K');//写入一个字节

            //第二种
            String str = "Hello Mr. li CC";
            //str.getBytes() 是把字符串 -> 字节
            //fileOutputStream.write(str.getBytes());

            //第三种 write(byte[] b, int off, int len)
            //将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
            fileOutputStream.write(str.getBytes(), 0, str.length());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
