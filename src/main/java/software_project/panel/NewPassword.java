package software_project.panel;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NewPassword extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	
	public NewPassword() {
		
		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.CENTER);
		p1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("새 비밀번호 설정");
		lblNewLabel.setBounds(12, 10, 149, 15);
		p1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(32, 52, 93, 15);
		p1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 49, 149, 21);
		p1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인");
		lblNewLabel_2.setBounds(32, 95, 93, 15);
		p1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 92, 149, 21);
		p1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel p2 = new JPanel();
		add(p2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("확인");
		p2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		p2.add(btnNewButton_1);
	}

}
