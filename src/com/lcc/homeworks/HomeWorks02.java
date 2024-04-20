package com.lcc.homeworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorks02 {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\JavaCollectionDemo\\src\\com\\hspedu\\homework_\\Homework01.java";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        int lineNum = 0;
        while ((line = br.readLine()) != null) {
            System.out.println((++lineNum)+"行:"+line);
        }
        br.close();
    }
}
