package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaOperaciones extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtMailEntered;
	private JTextField txtPasswordEntered;
	JButton btnLogin,btnSignUp;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Login Window");
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lbltittle = new JLabel("Login");
		lbltittle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbltittle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltittle.setBounds(179, 10, 244, 103);
		contentPane.add(lbltittle);
		
		JLabel lblUserTittleText = new JLabel("Ingrese correo:");
		lblUserTittleText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserTittleText.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserTittleText.setBounds(218, 105, 180, 48);
		contentPane.add(lblUserTittleText);
		
		txtMailEntered = new JTextField();
		txtMailEntered.setBounds(218, 149, 180, 32);
		contentPane.add(txtMailEntered);
		txtMailEntered.setColumns(10);
		
		txtPasswordEntered = new JTextField();
		txtPasswordEntered.setColumns(10);
		txtPasswordEntered.setBounds(218, 224, 180, 32);
		contentPane.add(txtPasswordEntered);
		
		JLabel lblPasswordTittleText = new JLabel("Ingrese contraseña:");
		lblPasswordTittleText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordTittleText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPasswordTittleText.setBounds(218, 181, 180, 48);
		contentPane.add(lblPasswordTittleText);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(218, 266, 87, 21);
		contentPane.add(btnLogin);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(this);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSignUp.setBounds(311, 266, 87, 21);
		contentPane.add(btnSignUp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
