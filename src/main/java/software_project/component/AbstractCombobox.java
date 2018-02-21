package software_project.component;

import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public abstract class AbstractCombobox<T> extends JPanel {

	protected JComboBox<T> comboBox;

	public AbstractCombobox() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout(0, 0));

		comboBox = new JComboBox<>();
		add(comboBox, BorderLayout.CENTER);
	}

	abstract public void loadData(T[] data);
}
