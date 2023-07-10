package GraphicInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Logic.App;
import Logic.Container;
import Logic.ContainerInterface;
import javax.swing.JOptionPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Login(Container container) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(157, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setBounds(34, 53, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(34, 92, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(117, 50, 86, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(116, 89, 87, 20);
		contentPane.add(jpassClave);
		
		JButton Ingresar = new JButton("Ingresar");
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = jpassClave.getPassword();
				String password = new String(clave);
				System.out.println(password);
				String userName = txtUsername.getText();
				
				if (container.searchByUserName(userName,password)) {
					
					if(container.userAdmin(userName)) {
						System.out.println("admin");
					}else {
						dispose();
						JOptionPane.showMessageDialog(null, userName);
						Principal p = new Principal(container);
						p.setVisible(true);
						p.setLocationRelativeTo(null);
					}
						
				} else {
					JOptionPane.showMessageDialog(null, "Usuario no encontrado","ERROR",JOptionPane.INFORMATION_MESSAGE);
					jpassClave.setText(""); txtUsername.setText("");
					txtUsername.requestFocus();
				}
			}
		});
		Ingresar.setBounds(246, 64, 89, 23);
		contentPane.add(Ingresar);
		
		JButton register = new JButton("Registrar");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterNewUser re = new RegisterNewUser(container);
				re.setVisible(true);
				re.setLocationRelativeTo(null);
			}
		});
		register.setBounds(335, 227, 89, 23);
		contentPane.add(register);
	}
	

}
