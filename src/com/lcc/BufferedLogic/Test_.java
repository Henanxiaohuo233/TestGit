package com.lcc.BufferedLogic;

public class Test_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(3);
        bufferedReader_.readFile();//初始方法

        //通过BufferedReader_多次读取字符串
        BufferedReader_ bufferedReader2 = new BufferedReader_(new StringReader_());
        bufferedReader2.readStrings(2);
        bufferedReader2.readString();//初始方法

    }
}
