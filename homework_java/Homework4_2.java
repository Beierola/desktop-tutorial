package homework_java;

import java.util.Scanner;

public class Homework4_2 {
	public static void main(String[] arge) {
		Scanner s = new Scanner(System.in);
        System.out.println("请输入三个整数：（Enter结束）");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a >= b && b >= c) {
			System.out.println("最大的数为："+a);
		}else if (a >= c && c >= b) {
			System.out.println("最大的数为："+a);
		}else if (b >= a && a >= c) {
			System.out.println("最大的数为："+b);
		}else if (b >= c && c >= a) {
			System.out.println("最大的数为："+b);
		}else if (c >= a && a >= b) {
			System.out.println("最大的数为："+c);
		}else {
			System.out.println("最大的数为："+c);
		}
	}

}