package GraphicInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton SoldiersGallery = new JButton("Ver galeria de soldados");
		SoldiersGallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pague1 p1 = new Pague1();
				ShowPanel(p1);
			}
		});
		SoldiersGallery.setBounds(10, 62, 182, 46);
		contentPane.add(SoldiersGallery);
		
		JButton programmersGallery = new JButton("Ver galeria de programadores");
		programmersGallery.setBounds(10, 119, 182, 46);
		contentPane.add(programmersGallery);
		
		JButton createTeam = new JButton("Crear equipo");
		createTeam.setBounds(10, 176, 182, 46);
		contentPane.add(createTeam);
		
		JButton battleRegister = new JButton("Registros de batalla");
		battleRegister.setBounds(10, 233, 182, 46);
		contentPane.add(battleRegister);
		
		JButton profileEdit = new JButton("Cambiar perfil");
		profileEdit.setBounds(10, 290, 182, 46);
		contentPane.add(profileEdit);
		
		JButton showTop = new JButton("Ver top");
		showTop.setBounds(10, 347, 182, 46);
		contentPane.add(showTop);
		
		JButton IAFigth = new JButton("Pelear contra una IA");
		IAFigth.setBounds(10, 404, 182, 46);
		contentPane.add(IAFigth);
		
		JPanel content = new JPanel();
		content.setBackground(new Color(192, 192, 192));
		content.setForeground(new Color(192, 192, 192));
		content.setBounds(204, 0, 510, 460);
		contentPane.add(content);
	}
	
	private void ShowPanel(JPanel p) {
		p.setSize(510,461);
		p.setLocation(0,0);
		
		contentPane.removeAll();
		contentPane.add(p,BorderLayout.CENTER);
		contentPane.revalidate();
		contentPane.repaint();
	}
}
