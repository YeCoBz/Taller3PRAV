package GraphicInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominios.Users;
import Logic.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class RegisterNewUser extends JFrame {

	private JPanel contentPane;
	private JTextField nameUser;
	private JTextField passwordUser;
	private JTextField countryUser;
	private JTextField typeUser;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public RegisterNewUser(Container container) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setBounds(162, 11, 138, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setBounds(10, 70, 66, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pais:");
		lblNewLabel_1_2.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo de usuario:");
		lblNewLabel_1_3.setBounds(10, 120, 77, 14);
		contentPane.add(lblNewLabel_1_3);
		
		nameUser = new JTextField();
		nameUser.setBounds(119, 42, 86, 20);
		contentPane.add(nameUser);
		nameUser.setColumns(10);
		
		passwordUser = new JTextField();
		passwordUser.setColumns(10);
		passwordUser.setBounds(119, 67, 86, 20);
		contentPane.add(passwordUser);
		
		countryUser = new JTextField();
		countryUser.setColumns(10);
		countryUser.setBounds(119, 92, 86, 20);
		contentPane.add(countryUser);
		
		typeUser = new JTextField();
		typeUser.setColumns(10);
		typeUser.setBounds(119, 117, 86, 20);
		contentPane.add(typeUser);
		
		JButton registerUser = new JButton("REGISTRAR");
		registerUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = nameUser.getText();
				String password = passwordUser.getText();
				String country = countryUser.getText();
				String type = typeUser.getText();
				
				Users user = new Users(name,password,country,type);
				container.getUserList().add(user);
				
				try {
					container.savedUsersTxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Usuario registrado","BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}

			
		});
		registerUser.setBounds(272, 91, 89, 23);
		contentPane.add(registerUser);
	}
}
