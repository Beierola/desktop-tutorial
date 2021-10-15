package homework_java;

import java.util.Scanner;

public class Homework5_1 {
	public static void main(String[] args) {
		/*					*
		 * 				   * *
		 *                *   *
		 *               *     *
		 *              //*       *
		 *  	行数		 前空格数 中空格 	星星位置 
		 *  	1 			3 		0 		4+0  4-0 
		 * 	 	2			2 		1 		4+1	 4-1  
		 * 		3 			1		3 		4+2	 4-2 
		 *  	4 			0 		5 		4+3  4-3 	
		 *  	5			
		 *  	i 			n-i 	2*i-3 	n+i-1,	n-i+1 //一共有n行
		 **/
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = sc.nextInt();
		//上半部分
		for (int i=1;i<=n;i++) {			//控制行数
			for(int s=1;s<=n-i;s++) {		//控制输出的空格数
				System.out.print(" ");				
			}						
			for(int k=1;k<=2*i-1;k++) {
				if (k==1) {
					System.out.print("*");	
				}else if (k==2*i-1) {
					System.out.print("*");	
				}else {
					System.out.print(" ");	
				}
			}
			System.out.print("\n");
				//System.out.print("*");
			}
			
		
		//下半部分
		/*
		 *   /////////*     *
		 *    *   *
		 * 	   * *
		 * 		*
		 *  	行数		 前空格数 中空格 	星星位置 
		 *  	1 			1 		3 		  
		 * 	 	2			2 		1 	 
		 * 		3 			3		0 		
		 *  	 	
		 *  				
		 *  	m 			m 			 	n+i-1,	n-i+1 //一共有n-1=m行
		*/
		 for(int m=1; m<=n-1; m++) { 	//控制行数
			 for(int p=1;p<=m;p++) { 	//控制空格数
				 System.out.print(" "); 
				 }
			 for(int q=1; q<=2*n-1-2*m; q++) { 
				 if (q==1) {
					 System.out.print("*");
				 }
				 else if(q==2*n-1-2*m) {
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }			  			 
		  	 
			 }
			 System.out.print("\n");
		 						
		 } 
	}
	

}
