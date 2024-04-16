package com.lcc.writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\ok.txt";
        //new BufferedWriter(new FileWriter(filePath)); 表示添加内容时是追加不是覆盖
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        bufferedWriter.write("你好，我是李某人");
        bufferedWriter.newLine();
        bufferedWriter.write("你好，我是王某人");
        bufferedWriter.newLine();
        bufferedWriter.write("你好，我是克某人");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
