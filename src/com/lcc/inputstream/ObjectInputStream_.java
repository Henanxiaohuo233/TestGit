package com.lcc.inputstream;

import com.lcc.outputstream_.Dog;

import java.io.*;


public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception,ClassNotFoundException {
        String filePath = "d:\\test.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //1.读取（反序列化）的顺序需要和你保存（序列化）的序列一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //读取对象
        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息=" + dog);//底层 Object -> Dog
        // 1.如果调用Dog的方法，需要向下转型
        // 2.需要将Dog类的定义，放到可以引用的位置
        Dog dog2= (Dog)dog;
        System.out.println(dog2.getName());
        ois.close();
        

    }
}
