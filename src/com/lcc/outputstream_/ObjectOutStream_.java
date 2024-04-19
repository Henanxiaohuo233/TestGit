package com.lcc.outputstream_;

import java.io.*;

/**
 * 演示ObjectOutStream的使用，完成数据的序列化
 **/

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存。
        String srcPith = "d:\\test.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(srcPith));
        oos.writeInt(100);          // int -> Integer(实现了 Serializable)
        oos.writeBoolean(true);     // boolean -> Boolean(实现了 Serializable)
        oos.writeChar('a');         // char -> Character(实现了 Serializable)
        oos.writeDouble(9.5);       // double -> Double(实现了 Serializable)
        oos.writeUTF("字符串类型");   //String
        //保存一个dog对象
        oos.writeObject(new Dog("旺财", 10));

        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}


