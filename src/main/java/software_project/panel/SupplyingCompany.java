package software_project.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SupplyingCompany extends JPanel {
	private JTextField tfSearchPC;
	private JTextField tfPCName;
	private JTextField tfPCPhone;
	private JTextField tfPCZipCode;
	private JTextField tfPCJuso;
	private JTextField tfPCJusoDetail;
	private ImageIcon img = new ImageIcon("images/twitter1.png");
	
	public SupplyingCompany() {

		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		p1.setBounds(0, 0, 800, 136);
		add(p1);
		p1.setLayout(null);
		
		JPanel pImg = new JPanel();
		pImg.setBorder(new EmptyBorder(5, 5, 0, 0));
		pImg.setBounds(0, 10, 121, 126);
		p1.add(pImg);
		pImg.setLayout(null);
		
		JLabel lblPCImg = new JLabel("");
		lblPCImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCImg.setBounds(12, 0, 109, 93);
		lblPCImg.setIcon(img);
		pImg.add(lblPCImg);
		
		JButton btnPCImgUp = new JButton("이미지등록");
		btnPCImgUp.setBounds(12, 103, 109, 23);
		pImg.add(btnPCImgUp);
		
		JPanel pNaming = new JPanel();
		pNaming.setBounds(126, 10, 674, 126);
		p1.add(pNaming);
		pNaming.setLayout(null);
		
		JLabel lblPCName = new JLabel("회사명");
		lblPCName.setBounds(0, 14, 61, 15);
		pNaming.add(lblPCName);
		
		tfPCName = new JTextField();
		tfPCName.setBounds(316, 42, 322, 21);
		pNaming.add(tfPCName);
		tfPCName.setColumns(10);
		
		JLabel lblPCPhone = new JLabel("전화번호");
		lblPCPhone.setBounds(256, 14, 61, 15);
		pNaming.add(lblPCPhone);
		
		tfPCPhone = new JTextField();
		tfPCPhone.setBounds(316, 11, 150, 21);
		pNaming.add(tfPCPhone);
		tfPCPhone.setColumns(10);
		
		JLabel lblPCManager = new JLabel("담당자");
		lblPCManager.setBounds(490, 14, 48, 15);
		pNaming.add(lblPCManager);
		
		JComboBox cmbPCManager = new JComboBox();
		cmbPCManager.setBounds(538, 11, 100, 21);
		pNaming.add(cmbPCManager);
		
		JLabel lblPCZipCode = new JLabel("우편번호");
		lblPCZipCode.setBounds(0, 43, 57, 15);
		pNaming.add(lblPCZipCode);
		
		tfPCZipCode = new JTextField();
		tfPCZipCode.setBounds(60, 38, 116, 21);
		pNaming.add(tfPCZipCode);
		tfPCZipCode.setColumns(10);
		
		JButton btnPCSchZipCode = new JButton("검색");
		btnPCSchZipCode.setBounds(181, 38, 61, 23);
		pNaming.add(btnPCSchZipCode);
		
		JLabel lblPCJuso = new JLabel("상세주소");
		lblPCJuso.setBounds(256, 45, 57, 15);
		pNaming.add(lblPCJuso);
		
		tfPCJuso = new JTextField();
		tfPCJuso.setBounds(60, 10, 116, 21);
		pNaming.add(tfPCJuso);
		tfPCJuso.setColumns(10);
		
		tfPCJusoDetail = new JTextField();
		tfPCJusoDetail.setColumns(10);
		tfPCJusoDetail.setBounds(316, 72, 322, 21);
		pNaming.add(tfPCJusoDetail);
		
		JButton btnSubmitPC = new JButton("등록");
		
		btnSubmitPC.setBounds(502, 103, 61, 23);
		pNaming.add(btnSubmitPC);
		
		JButton btnCancelPC = new JButton("취소");
		btnCancelPC.setBounds(577, 103, 61, 23);
		pNaming.add(btnCancelPC);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new EmptyBorder(5, 5, 5, 5));
		p2.setBounds(0, 146, 800, 39);
		add(p2);
		p2.setLayout(null);
		
		JComboBox cmbSearchPC = new JComboBox();
		cmbSearchPC.setBounds(12, 10, 109, 21);
		p2.add(cmbSearchPC);
		
		tfSearchPC = new JTextField();
		tfSearchPC.setBounds(132, 10, 560, 21);
		p2.add(tfSearchPC);
		tfSearchPC.setColumns(10);
		
		JButton btnSearchPC = new JButton("검색");
		btnSearchPC.setBounds(704, 9, 60, 23);
		p2.add(btnSearchPC);
		
		JPanel p3 = new JPanel();
		p3.setBorder(new EmptyBorder(5, 5, 5, 5));
		p3.setBounds(0, 195, 800, 205);
		add(p3);
		p3.setLayout(new BorderLayout(0, 0));
		
		JPanel pTable = new JPanel();
		p3.add(pTable, BorderLayout.CENTER);
		
		JPanel pPaging = new JPanel();
		p3.add(pPaging, BorderLayout.SOUTH);
		pPaging.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("<");
	
		pPaging.add(btnNewButton_1);
		
		JButton button_1 = new JButton("1");
		pPaging.add(button_1);
		
		JButton button_2 = new JButton("2");
		
		pPaging.add(button_2);
		
		JButton button_3 = new JButton("3");
		pPaging.add(button_3);
		
		JButton button_4 = new JButton(">");
	
		pPaging.add(button_4);

	}

}
