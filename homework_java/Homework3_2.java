package homework_java;              //包名为 homework_java

import java.util.Scanner;           //把util包下的Scanner类导入到程序中，Scanner类可以用以获取控制台输入

public class Homework3_2            //Java第3次作业第2题：要求用户从键盘上输入一个浮点数，然后将浮点数的整数部分输出
{
    public static void main(String[] args) {            //程序入口
        Scanner reader = new Scanner(System.in);        //运用Scanner类定义一个新的对象：reader
        System.out.print("请输入一个浮点数：");
        float f = reader.nextFloat();
        //对浮点数进行取整
        int result = (int)f;
        //输出取整后的浮点数
        System.out.print("输入的浮点数的整数部分为："+result);

    }
}
