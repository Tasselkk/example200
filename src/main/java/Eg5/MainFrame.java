/**
 * 
 */
package Eg5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.Set;

import Eg5.CityMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @author kw
 *
 */
public class MainFrame extends JFrame {
	/**
	 * @param args
	 */
	JLabel lb_name;
	JLabel lb_sex;
	JLabel lb_province;
	JLabel lb_city;
	JLabel lb_address;
	JLabel lb_Email;
	JButton bt_save;
	JButton bt_reset;
	JComboBox<String> cb_sex;
	JComboBox<String> cb_province;
	JComboBox<String> cb_city;
	JPanel panel;
	JTextField tf_name;
	JTextField tf_address;
	JTextField tf_Email;

	public Object[] getProvince() {
		Map<String, String[]> map = CityMap.model;
		Set<String> set = map.keySet();
		Object[] province = set.toArray();
		return province;
	}

	public String[] getCity(String selected) {
		Map<String, String[]> map = CityMap.model;
		String[] city = map.get(selected);
		return city;
	}

	public void updateCity() {
		String selectedProvince = (String) cb_province.getSelectedItem();
		String[] arrCity = getCity(selectedProvince);
		cb_city.setModel(new DefaultComboBoxModel(arrCity));
	}

	public MainFrame() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		setTitle("个人信息填报");
		setLayout(null);
		setBounds(100, 100, 518, 379);

		lb_name = new JLabel("姓  名：");// 姓名标签
		lb_name.setBounds(36, 43, 65, 18);

		tf_name = new JTextField();// 姓名输入框
		tf_name.setBounds(113, 38, 154, 28);

		lb_sex = new JLabel("性  别：");// 性别标签
		lb_sex.setBounds(36, 84, 65, 18);

		cb_sex = new JComboBox();// 性别下拉选择
		cb_sex.setBounds(113, 81, 66, 25);
		cb_sex.setModel(new DefaultComboBoxModel(new String[] { "请选择性别", "男", "女" }));

		panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(36, 126, 438, 70);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "居住地", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
				null, null));

		cb_province = new JComboBox();
		cb_province.setBounds(25, 25, 124, 27);
		cb_province.setModel(new DefaultComboBoxModel(getProvince()));
		cb_province.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				// TODO 自动生成的方法存根
				updateCity();
			}
		});

		lb_province = new JLabel();// 省标签
		lb_province.setText("省/直辖市");
		lb_province.setBounds(155, 30, 66, 18);

		cb_city = new JComboBox();// 市下拉选择框
		cb_city.setBounds(245, 25, 124, 27);

		lb_city = new JLabel();
		lb_city.setText("市/县");
		lb_city.setBounds(375, 30, 37, 18);

		panel.add(cb_province);
		panel.add(lb_province);
		panel.add(cb_city);
		panel.add(lb_city);

		bt_save = new JButton("保存");
		bt_save.setBounds(159, 289, 75, 28);
		bt_save.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JOptionPane.showMessageDialog(null, "信息已保存！");
			}
		});

		bt_reset = new JButton("重置");
		bt_reset.setBounds(265, 289, 75, 28);
		bt_reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				ButtonReset();
				JOptionPane.showMessageDialog(null, "信息已重置！");
			}
		});

		c.add(lb_name);
		c.add(lb_sex);
		c.add(tf_name);
		c.add(cb_sex);
		c.add(panel);
		c.add(bt_save);
		c.add(bt_reset);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MainFrame();

	}

	private void ButtonReset() {
		cb_sex.setSelectedIndex(0);
		cb_city.setSelectedItem(0);
		cb_province.setSelectedIndex(0);
		tf_name.setText("");

	}

	private void ButtonSave() {

	}
}
