package software_project.table;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;




public class SupplyingCompanyLists extends JPanel {
	protected JTable table;
	
	public SupplyingCompanyLists() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		loadDatas();
		scrollPane.setViewportView(table);
	}
	private void loadDatas() {
		NonEditableModel model = new NonEditableModel(getRows(), getColumNames());
		table.setModel(model);
		setAlignWidth();
		
	}
	
	private Object[][] getRows() {
		Object[][] rows = null;
		try {
			List<Management> list = ManagementDao.getInstance().selectItemByAll();
			rows = new Object[list.size()][];
			for(int i=0; i<list.size(); i++) {
				rows[i] = list.get(i).toArray();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}
	public String[] getColumNames() {
		
		return new String[] {"번호", "회사명", "주소","전화번호","담당자"};
	}
	private void setAlignWidth() {
		//셀의 너비와 정렬
				tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3,4);
				
				tableCellWidth(200, 300, 500, 400, 300);
		
	}

		protected void tableCellWidth(int... width) {
			TableColumnModel model = table.getColumnModel();
			for (int i = 0; i < width.length; i++) {
				model.getColumn(i).setPreferredWidth(width[i]);
			}
		
	}
		protected void tableCellAlign(int align, int... idx) {
			DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
			dtcr.setHorizontalAlignment(align);

			TableColumnModel model = table.getColumnModel();
			for (int i = 0; i < idx.length; i++) {
				model.getColumn(idx[i]).setCellRenderer(dtcr);
			}
	}

		// 테이블 내용을 수정하지 못하게 하는 클래스
		class NonEditableModel extends DefaultTableModel {
			public NonEditableModel(Object[][] data, Object[] columnNames) {
				super(data, columnNames);
			}

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		}

}
