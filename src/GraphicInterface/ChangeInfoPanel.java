package GraphicInterface;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class ChangeInfoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChangeInfoPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 532, 450);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(234, 176, 46, 14);
		panel.add(lblNewLabel);

	}

}
