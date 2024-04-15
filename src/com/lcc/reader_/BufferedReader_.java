package com.lcc.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\JavaCollectionDemo\\src\\com\\hspedu\\homework_\\Homework01.java";
        //创建BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高
        //1. bufferedReader.readLine()时按行读取文件
        //2. 当返回NUll时，表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //关闭流，只需要关闭 BufferedReader，因为底层会自动关闭 节点流 FileReader
        /*
        public void close() throws IOException {
            synchronized (lock) {
                if (in == null)
                    return;
                try {
                    in.close(); //这个就是new FileReader(filePath)的close
                } finally {
                    in = null;
                    cb = null;
                }
            }
        }
        */
        bufferedReader.close();

    }
}
