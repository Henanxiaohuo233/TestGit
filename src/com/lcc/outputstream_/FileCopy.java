package com.lcc.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        String scrFilePath = "d:\\iss069-e-86875.jpg";
        String destFilePath = "d:\\c-dTest.jpg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(scrFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到文件后，就写入文件 通过 fileOutputStream
                // 一边读取，一边写入
                fileOutputStream.write(buf, 0, readLen);//必须使用这个方法
            }
            System.out.println("拷贝完成！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入输出流，释放资源
            try {
                if (fileInputStream != null) fileInputStream.close();
                if (fileOutputStream != null) fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
