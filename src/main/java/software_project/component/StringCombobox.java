package software_project.component;

import javax.swing.DefaultComboBoxModel;

public class StringCombobox extends AbstractCombobox<String> {

	
	public StringCombobox() {

	}

	@Override
	public void loadData(String[] data) {
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<>(data);
		comboBox.setModel(dcbm);
		
	}

}
