package GraphicInterface;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Pague1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pague1() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 510, 46);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(222, 213, 46, 14);
		panel.add(lblNewLabel);

	}
}
