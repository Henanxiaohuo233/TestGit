package com.lcc.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings({"all"})

public class FileInputStream_ {
    public static void main(String[] args) {

    }


    /**
     * 演示读取文件。。。
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\hello.txt";
        int readDate = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            // 如果返回-1，表示读取完毕
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.print((char) readDate);//转成char显示
            }
        } catch (IOException e) { //这里变成IOException是为了抑制read()异常和FileInputStream
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源。
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * 演示读取文件。。。
     * -> 使用 read(byte[])
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";
        //定义字节数组
        byte[] buf = new byte[8];//一次行读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;

        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取最多b.length字节的数据到字节数组。该方法将阻塞，直到某些输入可用;
            // 如果返回-1，表示读取完毕
            // 如果读取正常，返回实际读取的字节数。
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));//转成String显示
            }
        } catch (IOException e) { //这里变成IOException是为了抑制read()异常和FileInputStream
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源。
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}