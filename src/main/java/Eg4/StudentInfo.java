/**
 * JTable设置好标题，填入数据
 * JTable完成后放入JSCrollPane中
 * JSCrollPane放入Container中
 */
package Eg4;

import java.awt.Container;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * @author kw
 *
 */
public class StudentInfo extends JFrame{
	JTable tb;
	DefaultTableModel model;
	/**
	 * @param args
	 */
	private StudentInfo() {
		Container c =getContentPane();
		JScrollPane sp =new JScrollPane();
		setBounds(100, 100, 275, 255);
		tb=new JTable(6, 3);
		tb.setRowHeight(50);
		String[] columns = {"姓名","性别","出生日期"};
		model =new DefaultTableModel(columns,0);
		
		sp.setViewportView(GetTable());
		c.add(sp);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	JTable GetTable() {
		List<String> Student =getStudent();
		tb.setModel(model);
		for (String string : Student) {
			String[] args=string.split(",");
			model.addRow(args);
			
		}
		return tb;
	}
	private List<String> getStudent(){
		
	        // 创建List集合对象
	        List<String> list = new ArrayList<String>();
	        list.add("李哥,男,1981-1-1");// 添加数据到集合对象
	        list.add("小陈,女,1981-1-1");
	        list.add("小刘,男,1981-1-1");
	        list.add("小张,男,1981-1-1");
	        list.add("小董,男,1981-1-1");
	        list.add("小吕,男,1981-1-1");
	        return list;
	    
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		
		try {
			EventQueue.invokeLater(new Runnable() {//按顺序更新swing组件
				
				public void run() {
					// TODO 自动生成的方法存根
					new StudentInfo();
				}
			});
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
