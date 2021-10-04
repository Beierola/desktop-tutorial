/**小朋友搬椅子
 * 请用户输入年龄，如果大于等于7岁，可以搬椅子
 * 如果大于等于5岁，性别是男，可以搬椅子；性别如果是女，输出一句提示，你力气小不可以搬椅子。
 * 如果年龄小于5，则输出你太小了，容易受伤，不可以搬椅子。 
 * 
 *   hasNextInt () 方法是判断控制台接收是否为数字,当你在控制台输入一个字符的时候,hasNextInt ()判断你输入这个字符是不是数字，如果整数则为true，反之。
 *   charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1；
 *   汉字字符被储存在常量池，所以在比较时需要被索引
 */
package homework_java;
import java.util.Scanner;		//把util包下的Scanner类导入到程序中，Scanner类可以用以获取控制台输入
public class Homework4_1 {
	public static void main(String[] arge)
	{
		Scanner reader = new Scanner(System.in);			//运用Scanner类定义一个新的对象：reader
		System.out.print("请输入你的年龄：");
		if(reader.hasNextInt()==true) {						//执行条件：是否为整数
			int age =reader.nextInt();						//将输入的年龄赋值给int型变量age
			if(age>=0) {									//判断是否为正数
				if(age>=7) {								//可能1、年龄大于等于7岁
					System.out.print("你可以搬椅子");
				}else if(age<5) {							//可能2、年龄小于5岁
					System.out.print("你太小了，容易受伤，不可以搬椅子");
				}else {										//可能3、年龄大于等于5岁小于7岁
					System.out.print("请输入你的性别：");
					String sex = reader.next();				//获取输入的性别
					char c =sex.charAt(0);					//将输入的性别字符可以被索引
					if (c=='男') {							//可能3.1 性别为男时
						System.out.print("你可以搬椅子");									
					}else if (c=='女') {					//可能3.2 性别为女时
						System.out.print("你力气小，不可以搬椅子");
					}else System.out.print("您输入的不是性别，请您输入正确的性别(例如：男、女)：");	//可能3.3 输入错误时										    
				}				
			}else  System.out.print("您输入的是负数，请您重新输入正数：");
			
		}else System.out.print("您输入的是非整数，请您重新输入整数：");
	}
}