package homework_java;          //包名为 homework_java

import java.util.Scanner;       //把util包下的Scanner类导入到程序中，Scanner类可以用以获取控制台输入

public class Homework3_1            //Java第3次作业第1题
{
    public static void main(String[] args) {            //程序入口
        Scanner reader = new Scanner(System.in);        //运用Scanner类定义一个新的对象：reader
        //录入数据
        System.out.print("请输入你的学院：");
        String college = reader.nextLine();
        System.out.print("请输入你的专业：");
        String magor = reader.nextLine();
        System.out.print("请输入你的姓名：");
        String name = reader.nextLine();
        System.out.print("请输入你的年龄：");
        String age = reader.nextLine();
        System.out.print("请输入你的身高(cm)：");
        String height = reader.nextLine();
        System.out.print("请输入你的体重(kg)：");
        String weight = reader.nextLine();
        System.out.print("请输入你的性别：");
        String sex = reader.nextLine();
        //输出包含各项信息连续的语句
        System.out.print("我是来自"+college+magor+"专业的"+name+"，我今年"+age+"岁，身高为"+height+"cm，体重为"+weight+"kg,性别"+sex);

    }
}
