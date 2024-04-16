package com.lcc.inputstream;

import java.io.*;
/**
 * 演示使用 BufferedOutputStream和BufferedInputStream
 * 完成对二进制文件拷贝
 * 也可以操作文本文件！
 * **/

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcPith = "D:\\老姐音频\\啊绛音乐太长了.mp3";
        String destPith = "D:\\CopyMp3.mp3";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcPith));
            bos = new BufferedOutputStream(new FileOutputStream(destPith));

            //循环读取并循环写入 destFilePath
            byte[] buff = new byte[1024];
            int readLine = 0;

            //返回-1时，就表示文件读取完毕。
            while ((readLine = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLine);
            }
            System.out.println("Copy OK！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
