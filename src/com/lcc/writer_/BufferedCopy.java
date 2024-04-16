package com.lcc.writer_;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {

        /**
         * BufferedReader 和 BufferedWriter 是按字符读取的，不要操作二进制文件(mp3,mp4,PDF,Word文档)肯定会导致文件损坏
         * **/

        String srcPith = "d:\\JavaCollectionDemo\\src\\com\\hspedu\\homework_\\Homework01.java";
        String destPith = "d:\\HomeworkCopy.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcPith));
            bw = new BufferedWriter(new FileWriter(destPith));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("CopySucceed...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
