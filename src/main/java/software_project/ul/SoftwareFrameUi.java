package software_project.ul;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import software_project.panel.OrderSoftware;
import software_project.panel.StatusManagement;
import software_project.panel.SupplyingCompany;
import software_project.panel.UpdateCustomerInfo;

public class SoftwareFrameUi extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareFrameUi frame = new SoftwareFrameUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SoftwareFrameUi() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel p1 = new JPanel();
		contentPane.add(p1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("공급회사등록");
		p1.add(lblNewLabel);
		
		
		
		SupplyingCompany panel = new SupplyingCompany();
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
