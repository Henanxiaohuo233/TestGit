package com.lcc.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePith = "d:\\node.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'v', 'd'};

        try {
            fileWriter = new FileWriter(filePith);//不加true,默认是覆盖写入

            //1.write(int):写入单个字符
            fileWriter.write('H');
            //2.writer(char[]):写入指定数组
            fileWriter.write(chars);
            //3.write(char[],off,len):写入指定数字的指定部分
            fileWriter.write("李某人".toCharArray(), 0, 3);
            //4.write(string):写入整个字符串
            fileWriter.write(" 风雨之后");
            //5.write(string,off,len):写入字符串的指定部分
            fileWriter.write("河南郑州", 0, 2);//str下标为0的位置写入两个字符'河南'


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                /*
                * private void writeBytes() throws IOException {
        this.bb.flip();
        int var1 = this.bb.limit();
        int var2 = this.bb.position();

        assert var2 <= var1;

        int var3 = var2 <= var1 ? var1 - var2 : 0;
        if (var3 > 0) {
            if (this.ch != null) {
                assert this.ch.write(this.bb) == var3 : var3;
            } else {
                this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);
            }
        }

        this.bb.clear();
    }
                * */
                try {
                    //fileWriter.flush();
                    //关闭文件流，等价 flush() + 关闭
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-程序结束-");
        }
    }
}
