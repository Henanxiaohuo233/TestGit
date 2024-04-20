package com.lcc.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {

        //System 类里面的 public final static InputStream in = null;
            // System.in 编译类型 InputStream
            // System.in 运行类型 BufferedInputStream
            // 表示是标准输入 键盘
        System.out.println(System.in.getClass()); //class java.io.BufferedInputStream

        //System 类里面的 public final static PrintStream out = null;
            // 编译类型 PrintStream
            // 运行类型 PrintStream
            // 表示标准输出 显示器
        System.out.println(System.out.getClass()); //class java.io.PrintStream

        System.out.println("Hello!word");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }
}
