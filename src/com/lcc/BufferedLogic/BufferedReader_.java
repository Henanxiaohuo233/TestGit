package com.lcc.BufferedLogic;
//做成处理流/包装流
public class BufferedReader_ extends Reader_ {

    private Reader_ reader_;

    //接受Reader_ 的子类
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {
        reader_.readFile();
    }

    //让方法更灵活，多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }

}
