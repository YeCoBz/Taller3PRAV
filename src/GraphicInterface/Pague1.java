package GraphicInterface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import Dominios.Soldiers;
import Dominios.Users;
import Logic.Container;

import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pague1 extends JPanel {

	Container container;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public Pague1(Container container) {
		setLayout(null);
		
		JLabel lblTableSoldiersTittle = new JLabel("Soldiers");
		lblTableSoldiersTittle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTableSoldiersTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTableSoldiersTittle.setBounds(199, 10, 260, 51);
		add(lblTableSoldiersTittle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 71, 550, 309);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal(container);
				p.setVisible(true);
				p.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setBounds(60, 390, 85, 21);
		add(btnNewButton);
		
	}

	public void setList(Container container) {
		this.container = container;
	}

	public void showListSoldier() {
		List<Soldiers> listSoldier = container.getSoldierList();
		Iterator<Soldiers> it = listSoldier.iterator();
		String result = "Soldier Info\n";
		
		while (it.hasNext()) {
			
			Soldiers soldier = (Soldiers) it.next();
			
			result+=soldier.toString()+"\n";
		}
		textArea.setText(result);
	}
}
