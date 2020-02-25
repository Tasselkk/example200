import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author kw
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String Str = new String("W3Cschool教程:www.w3cschool.cn");
		String SubStr1 = new String("youj");
		String SubStr2 = new String("com");

		System.out.print("查找字符 o 第一次出现的位置 :" );
		System.out.println(Str.indexOf( 'o' ));
		System.out.print("从第14个位置查找字符 o 第一次出现的位置 :" );
		System.out.println(Str.indexOf( 'o', 14 ));
		System.out.print("子字符串 SubStr1 第一次出现的位置:" );
		System.out.println( Str.indexOf( SubStr1 ));
		System.out.print("从第十五个位置开始搜索子字符串 SubStr1 第一次出现的位置 :" );
		System.out.println( Str.indexOf( SubStr1, 15 ));
		System.out.print("子字符串 SubStr2 第一次出现的位置 :" );
		System.out.println(Str.indexOf( SubStr2 ));
		System.out.println("sc第一次出现的位置："+Str.indexOf("sc"));
		System.out.println("=========================");
		String s ="123.4567";
		Double d =new Double(123.4567);
		String[] ss= {"ss","tt","pp"};
		System.out.println(ss[s.charAt(1)-48]);
		System.out.println(d.compareTo(123.4567));
		System.out.println(s.substring(2));
		System.out.println(s.substring(s.indexOf(".")));
		DecimalFormat df =new DecimalFormat("#0.###");
		String pat =df.format(d);
		System.out.println(pat);
		System.out.println("==============");
		String s1="asdfgh";
		s1=s1.replace("as", "l");
		System.out.println(s1);
	}

}
