package software_project.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderSoftware extends JPanel {
	private JTextField textField;

	public OrderSoftware() {

		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBorder(new EmptyBorder(0, 0, 0, 0));
		p1.setBounds(5, 10, 780, 68);
		add(p1);
		p1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 6, 110, 21);
		p1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 6, 110, 21);
		p1.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(244, 6, 450, 21);
		p1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(706, 5, 60, 23);
		p1.add(btnNewButton);
		
		JButton button = new JButton("등록");
		button.setBounds(706, 38, 60, 23);
		p1.add(button);
		
		JPanel p2 = new JPanel();
		p2.setBounds(5, 79, 780, 311);
		add(p2);
		p2.setLayout(null);
		
		JPanel pTable = new JPanel();
		pTable.setBounds(5, 5, 780, 243);
		p2.add(pTable);
		pTable.setLayout(new BorderLayout(0, 0));
		
		JPanel pPaging = new JPanel();
		pPaging.setBounds(5, 258, 780, 43);
		p2.add(pPaging);
		pPaging.setLayout(null);
		
		JButton btn1 = new JButton("<");
		btn1.setBounds(266, 10, 41, 23);
		pPaging.add(btn1);
		
		JButton btn2 = new JButton("1");
		btn2.setBounds(319, 10, 42, 23);
		pPaging.add(btn2);
		
		JButton btn3 = new JButton("2");
		btn3.setBounds(373, 10, 42, 23);
		pPaging.add(btn3);
		
		JButton btn4 = new JButton("3");
		btn4.setBounds(427, 10, 42, 23);
		pPaging.add(btn4);
		
		JButton btn5 = new JButton(">");
		btn5.setBounds(481, 10, 41, 23);
		pPaging.add(btn5);
	}

}
