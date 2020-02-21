/**
 * hashCode()方法
 */
package Eg3;

import java.util.Scanner;

/**
 * @author kw
 *
 */
public class HashTest {

	/**
	 * @param args
	 */
	private HashTest() {
		super();
		// TODO 自动生成的构造函数存根
		Scanner in =new Scanner(System.in);
		System.out.println("请输入新员工姓名：");
		String name ="";
		name =in.next();
		System.out.println("请输入部门(Java/C/Python):");
//		String[] s = {"Java","C","Python"};
//	    int[] l =new int[3];
//	    for (int i = 0; i < l.length; i++) {
//			l[i]=s[i].hashCode();
//			
//		}
//	    for (int i = 0; i < l.length; i++) {
//			System.out.println(l[i]);
//			
//		}
		String language =in.next();
		switch (language.hashCode()) {
		case 2301506: {
			System.out.println(name+"被分配到了Java部门");
			break;
			
		}
	    case 67:{
	    	System.out.println(name+"被分配到了C部门");
	    	break;
	    }
	    case -1889329924:{
	    	System.out.println(name+"被分配到了Python部门");
	    	break;
	    }
	    default:
	    	System.out.println("输入语言非法！");
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new HashTest();


	}

	

}
