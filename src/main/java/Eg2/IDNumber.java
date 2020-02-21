/**
 * 身份证号
 * 自定义异常
 */
package Eg2;

import java.util.Scanner;

/**
 * @author kw
 *
 */
public class IDNumber {
	String ID = "";

	/**
	 * @param args
	 */
	private IDNumber() {
		super();
		// TODO 自动生成的构造函数存根
		Scanner in = new Scanner(System.in);
		System.out.println("请输入身份证号码：");
		ID = in.next();
		in.close();
		System.out.println("输入控制台关闭！");

	}

	void PrintID() throws MyException {
		if (ID.length() != 18) {
			throw new MyException("输入的身份证号不是18位！");
		} else
			System.out.println("你输入的身份证号是：" + ID);

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IDNumber id = new IDNumber();
		try {
			id.PrintID();
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

	}

	

}
class MyException extends Exception {

		/**
		 * @param message
		 */
		MyException(String message) {
			super(message);
			// TODO 自动生成的构造函数存根
		}

	}
