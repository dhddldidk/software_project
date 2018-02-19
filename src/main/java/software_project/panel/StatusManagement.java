package software_project.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import software_project.table.StatusManagementLists;

public class StatusManagement extends JPanel {
	private JTextField textField;
	private JButton btn1;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public StatusManagement() {

		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(5, 5, 883, 69);
		add(p1);
		p1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 6, 110, 21);
		p1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 6, 110, 21);
		p1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(373, 6, 110, 21);
		p1.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(637, 6, 172, 21);
		p1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(811, 5, 60, 23);
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("거래명세서");
		btnNewButton_1.setBounds(657, 37, 105, 23);
		p1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("보고서");
		btnNewButton_2.setBounds(766, 37, 105, 23);
		p1.add(btnNewButton_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(505, 6, 110, 21);
		p1.add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("~");
		textField_1.setColumns(10);
		textField_1.setBounds(483, 6, 22, 21);
		p1.add(textField_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(244, 6, 110, 21);
		p1.add(comboBox_4);
		
		JPanel p2 = new JPanel();
		p2.setBounds(5, 84, 883, 411);
		add(p2);
		p2.setLayout(null);
		
		StatusManagementLists pTable = new StatusManagementLists();
		pTable.setBounds(5, 5, 866, 358);
		p2.add(pTable);
		pTable.setLayout(new BorderLayout(0, 0));
		
		JPanel pPaging = new JPanel();
		pPaging.setBounds(5, 373, 866, 33);
		p2.add(pPaging);
		pPaging.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn1 = new JButton("<");
		pPaging.add(btn1);
		
		JButton btn2 = new JButton("1");
		pPaging.add(btn2);
		
		JButton btn3 = new JButton("2");
		
		pPaging.add(btn3);
		
		JButton btn4 = new JButton("3");
		pPaging.add(btn4);
		
		JButton btn5 = new JButton(">");
	
		pPaging.add(btn5);

	}

}
