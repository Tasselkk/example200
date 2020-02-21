/**
 * 闰年
 * try-catch-finally语句
 */
package Eg1;

import java.util.Scanner;

/**
 * @author kw
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	private LeapYear() {
		super();
		// TODO 自动生成的构造函数存根
		int year = 0;
		Scanner in =new Scanner(System.in);
		System.out.println("请输入一个年份：");
		try {
			year=in.nextInt();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			
		    e.printStackTrace();
		    
		}
		finally {
			in.close();
			System.out.println("输入控制台关闭！");
		}
		if(year%400==0||(year%100!=0&&year%4==0)) {
			System.out.println(year+"是闰年！");
		}
		else
			System.out.println(year+"不是闰年！");
		
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new LeapYear();

	}

	

}
