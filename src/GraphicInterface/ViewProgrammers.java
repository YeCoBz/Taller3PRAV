package GraphicInterface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.SwingConstants;

import Dominios.Programmers;
import Logic.Container;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ViewProgrammers extends JPanel {

	private Container container;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public ViewProgrammers(Container container) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Programmers");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(231, 10, 185, 29);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 60, 559, 289);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setBounds(50, 374, 85, 21);
		add(btnNewButton);
		
	}

	public void setList(Container container) {
		this.container = container;
	}

	public void showListSchedulers() {
		List<Programmers> listProgrammer = container.getProgrammersList();
		Iterator<Programmers> it = listProgrammer.iterator();
		String result = "Programmers Info\n";
		
		while (it.hasNext()) {
			
			Programmers programmer = (Programmers) it.next();
			
			result+=programmer.toString()+"\n";
		}
		textArea.setText(result);
		
	}
	
}
