package software_project.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCustomerInfo extends JPanel {
	private JTextField tfNewPwd;
	private JTextField tfNewPwdChk;
	private JTextField tfOldId;
	private JTextField tfOldPwd;
	private JTextField tfChechPwd;
	private JTextField tfOldName;
	private JTextField tfOldPhone;
	private JTextField tfOldZipCode;
	private JTextField tfOldSchAddr;
	private JTextField tfOldSchAddrDetail;
	private ImageIcon img = new ImageIcon("images/twitter1.png");
	
	public UpdateCustomerInfo() {

		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 219, 290);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblOldImg = new JLabel("");
		lblOldImg.setBounds(62, 37, 100, 113);
		lblOldImg.setIcon(img);
		panel.add(lblOldImg);
		
		JButton btnNewImgSubmit = new JButton("이미지등록");
		btnNewImgSubmit.setBounds(62, 160, 100, 23);
		panel.add(btnNewImgSubmit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(228, 5, 567, 290);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOldId = new JLabel("아이디");
		lblOldId.setBounds(12, 14, 105, 15);
		panel_1.add(lblOldId);
		
		tfOldId = new JTextField();
		tfOldId.setBounds(155, 11, 191, 21);
		panel_1.add(tfOldId);
		tfOldId.setColumns(10);
		
		JLabel lblOldPwd = new JLabel("비밀번호");
		lblOldPwd.setBounds(12, 45, 105, 15);
		panel_1.add(lblOldPwd);
		
		tfOldPwd = new JTextField();
		tfOldPwd.setBounds(155, 42, 191, 21);
		panel_1.add(tfOldPwd);
		tfOldPwd.setColumns(10);
		
		JLabel lblCheckPwd = new JLabel("비밀번호 확인");
		lblCheckPwd.setBounds(12, 75, 105, 15);
		panel_1.add(lblCheckPwd);
		
		tfChechPwd = new JTextField();
		tfChechPwd.setBounds(155, 72, 191, 21);
		panel_1.add(tfChechPwd);
		tfChechPwd.setColumns(10);
		
		JLabel lblOldName = new JLabel("상호명");
		lblOldName.setBounds(12, 106, 105, 15);
		panel_1.add(lblOldName);
		
		tfOldName = new JTextField();
		tfOldName.setColumns(10);
		tfOldName.setBounds(155, 103, 191, 21);
		panel_1.add(tfOldName);
		
		JLabel lblOldPhone = new JLabel("전화번호");
		lblOldPhone.setBounds(12, 137, 105, 15);
		panel_1.add(lblOldPhone);
		
		tfOldPhone = new JTextField();
		tfOldPhone.setColumns(10);
		tfOldPhone.setBounds(155, 134, 191, 21);
		panel_1.add(tfOldPhone);
		
		JLabel lblOldZipCode = new JLabel("우편번호");
		lblOldZipCode.setBounds(12, 167, 105, 15);
		panel_1.add(lblOldZipCode);
		
		tfOldZipCode = new JTextField();
		tfOldZipCode.setColumns(10);
		tfOldZipCode.setBounds(155, 165, 116, 21);
		panel_1.add(tfOldZipCode);
		
		JLabel lblOldSchAddr = new JLabel("상세주소");
		lblOldSchAddr.setBounds(12, 198, 105, 15);
		panel_1.add(lblOldSchAddr);
		
		tfOldSchAddr = new JTextField();
		tfOldSchAddr.setColumns(10);
		tfOldSchAddr.setBounds(155, 196, 378, 21);
		panel_1.add(tfOldSchAddr);
		
		JButton btnOldSerch = new JButton("검색");
		btnOldSerch.setBounds(283, 163, 63, 23);
		panel_1.add(btnOldSerch);
		
		tfOldSchAddrDetail = new JTextField();
		tfOldSchAddrDetail.setBounds(155, 227, 378, 21);
		panel_1.add(tfOldSchAddrDetail);
		tfOldSchAddrDetail.setColumns(10);
		
		JButton btnNewSubmit = new JButton("등록");
		btnNewSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewSubmit.setBounds(392, 257, 63, 23);
		panel_1.add(btnNewSubmit);
		
		JButton btnNewCancel = new JButton("취소");
		btnNewCancel.setBounds(470, 257, 63, 23);
		panel_1.add(btnNewCancel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 305, 790, 90);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewPwdChange = new JLabel("비밀번호 변경");
		lblNewPwdChange.setBounds(12, 0, 126, 24);
		panel_2.add(lblNewPwdChange);
		
		JLabel lblNewPwd = new JLabel("비밀번호");
		lblNewPwd.setBounds(48, 34, 90, 15);
		panel_2.add(lblNewPwd);
		
		tfNewPwd = new JTextField();
		tfNewPwd.setBounds(150, 31, 210, 21);
		panel_2.add(tfNewPwd);
		tfNewPwd.setColumns(10);
		
		JLabel lblNewPwdChk = new JLabel("비밀번호 확인");
		lblNewPwdChk.setBounds(48, 65, 90, 15);
		panel_2.add(lblNewPwdChk);
		
		tfNewPwdChk = new JTextField();
		tfNewPwdChk.setBounds(150, 62, 210, 21);
		panel_2.add(tfNewPwdChk);
		tfNewPwdChk.setColumns(10);
		
		JButton btnNewPwdSubmit = new JButton("등록");
		btnNewPwdSubmit.setBounds(619, 57, 63, 23);
		panel_2.add(btnNewPwdSubmit);
		
		JButton btnNewPwdCancel = new JButton("취소");
		btnNewPwdCancel.setBounds(694, 57, 63, 23);
		panel_2.add(btnNewPwdCancel);
	}
}
