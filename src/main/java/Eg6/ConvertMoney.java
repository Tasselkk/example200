/**
 * 
 */
package Eg6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author kw
 *
 */
public class ConvertMoney {

	/**
	 * @param args
	 */
	StringBuffer sb = new StringBuffer();
	private final String[] convert_num = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	private final String[] convert_unit2 = { "角", "分", "厘" };
	private final String[] convert_unit1 = { "", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿" };

	private String Convert(double num) {
		DecimalFormat df = new DecimalFormat("#0.###");
		String num_s = df.format(num);
		if (num_s.indexOf(".") == -1) {// 金额为整数
			num_s = getInteger(num_s);
			num_s = num_s.replaceAll("零亿", "零");
			num_s = num_s.replaceAll("零仟万", "零");
			num_s = num_s.replaceAll("零佰万", "零");
			num_s = num_s.replaceAll("零拾万", "零");
			num_s = num_s.replaceAll("零万", "零");
			num_s = num_s.replaceAll("零仟", "零");
			num_s = num_s.replaceAll("零佰", "零");
			num_s = num_s.replaceAll("零拾", "零");
			num_s = num_s.replaceAll("零元", "零");
			num_s = num_s.replaceAll("零零", "零");
			num_s = num_s.replaceAll("零零", "零");
			num_s = num_s.replaceAll("零零", "零");
			if (num_s.lastIndexOf("零") == num_s.length() - 1) {
				num_s = num_s.substring(0, num_s.length() - 1);
			}
			return num_s + "元整";
		} else {// 金额不是整数
			String num_Int= getInteger(num_s);
			num_Int = num_Int.replaceAll("零亿", "零");
			num_Int = num_Int.replaceAll("零仟万", "零");
			num_Int = num_Int.replaceAll("零佰万", "零");
			num_Int = num_Int.replaceAll("零拾万", "零");
			num_Int = num_Int.replaceAll("零万", "零");
			num_Int = num_Int.replaceAll("零仟", "零");
			num_Int = num_Int.replaceAll("零佰", "零");
			num_Int = num_Int.replaceAll("零拾", "零");
			num_Int = num_Int.replaceAll("零元", "零");
			num_Int = num_Int.replaceAll("零零", "零");
			num_Int = num_Int.replaceAll("零零", "零");
			num_Int = num_Int.replaceAll("零零", "零");
			
			String num_Dec=getDecimal(num_s);
			num_Dec=num_Dec.replaceAll("零角", "零");
			num_Dec=num_Dec.replaceAll("零分", "零");
			num_Dec=num_Dec.replaceAll("零厘", "零");
			num_Dec=num_Dec.replaceAll("零零", "零");
			num_Dec=num_Dec.replaceAll("零零", "零");
			num_Dec=num_Dec.replaceAll("零零", "零");
			if (num_Int.lastIndexOf("零") == num_Int.length() - 1) {
				num_Int = num_Int.substring(0, num_Int.length() - 1);
			}
			if (num_Dec.lastIndexOf("零") == num_Dec.length() - 1) {
				num_Dec = num_Dec.substring(0, num_Dec.length() - 1);
			}
			return num_Int + "元"+num_Dec;
		} 
		
	}

	private String getInteger(String num_s) {// 处理整数部分
		//String num_Int = num_s;
		String num_Int = num_s.substring(0, num_s.indexOf("."));// 获取整数部分字符串
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num_Int.length(); i++) {
			sb.append(convert_num[num_Int.charAt(i) - 48]);
			sb.append(convert_unit1[num_Int.length() - i - 1]);

		}

		return sb.toString();
	}

	private String getDecimal(String num_s) {// 处理小数部分
		String num_Dec = num_s.substring(num_s.indexOf(".") + 1);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num_Dec.length(); i++) {
			sb.append(convert_num[num_Dec.charAt(i) - 48]);
			sb.append(convert_unit2[i]);

		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字金额：");
		double num = in.nextDouble();
		if (num > 999999999) {
			System.out.println("输入数额过大，无法转换！");
		} else {
			System.out.println("转换后的大写金额是：");
			ConvertMoney cm = new ConvertMoney();
			System.out.println(cm.Convert(num));
		}

	}

}
