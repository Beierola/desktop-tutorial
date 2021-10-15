package homework_java;

import java.util.Scanner;

public class Homework5_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n =sc.nextInt(); 
		/*			1
		 *         121
		 *        12321
		 *       1234321
		*/
		for (int i=1;i<=n;i++) {//控制行数
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if (k<=i) {
					System.out.print(k);
				}else {
					System.out.print(2*i-k);
				}				
			}
			System.out.print("\n");
		}
		
	}
}
