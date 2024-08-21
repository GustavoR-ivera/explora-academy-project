package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import businessLogic.LookForProgress;
import businessLogic.WritingQuestions;
import data.User;
import maintenance.Id_management;
import maintenance.User_management;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField text_user;
	private JTextField text_password;
	public static String User;
	public static int id;
	public static int Achievements;

	
	

	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 463, 477);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo (null);
		
		JLabel User = new JLabel("User:");
		User.setForeground(Color.WHITE);
		User.setFont(new Font("Agency FB", Font.BOLD, 30));
		User.setHorizontalAlignment(SwingConstants.CENTER);
		User.setBounds(63, 156, 50, 36);
		contentPane.add(User);
		
		JLabel Password = new JLabel("Password:");
		Password.setForeground(Color.WHITE);
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setFont(new Font("Agency FB", Font.BOLD, 30));
		Password.setBounds(63, 212, 98, 36);
		contentPane.add(Password);
		
		text_user = new JTextField();
		text_user.setBounds(178, 170, 230, 25);
		contentPane.add(text_user);
		text_user.setColumns(10);
		
		text_password = new JTextField();
		text_password.setBounds(178, 223, 230, 25);
		contentPane.add(text_password);
		text_password.setColumns(10);
		
		JButton btnNewButton_login = new JButton("Log In ");
		btnNewButton_login.setFocusPainted(false);
		btnNewButton_login.setDefaultCapable(false);
		btnNewButton_login.setBorderPainted(false);
		btnNewButton_login.setBackground(Color.WHITE);
		btnNewButton_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton_login.setFont(new Font("Californian FB", Font.BOLD, 25));
		btnNewButton_login.setBounds(151, 280, 145, 40);
		contentPane.add(btnNewButton_login);
		
		JButton btnRegistrarse_sign = new JButton("Register");
		btnRegistrarse_sign.setDefaultCapable(false);
		btnRegistrarse_sign.setFocusPainted(false);
		btnRegistrarse_sign.setBorderPainted(false);
		btnRegistrarse_sign.setBackground(Color.WHITE);
		btnRegistrarse_sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				sign();
			}
		});
		btnRegistrarse_sign.setFont(new Font("Californian FB", Font.BOLD, 25));
		btnRegistrarse_sign.setBounds(151, 331, 145, 40);
		contentPane.add(btnRegistrarse_sign);
		
		JLabel lblTittle = new JLabel("Explora Academy");
		lblTittle.setForeground(Color.WHITE);
		lblTittle.setFont(new Font("Agency FB", Font.BOLD, 50));
		lblTittle.setBounds(90, 56, 295, 60);
		contentPane.add(lblTittle);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/images/logo.jpg")));
		lblNewLabel_1.setBounds(20, 56, 60, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/fondoFormLogIn.jpg")));
		lblNewLabel.setBounds(0, 0, 447, 438);
		contentPane.add(lblNewLabel);
	}

	protected void sign() {
		
		this.dispose();
		SignUser registrar = new SignUser();
		registrar.setVisible(true);
	
	}

	protected void login() {
		
		String user = text_user.getText();
		String password = String.valueOf (text_password.getText());

		User_management manage_user = new User_management();
		User user1 = new User();

		user1.setUser(user);
		user1.setPassword(password);
		
		User usu = manage_user.get_user(user1);		
		
		if (usu!= null) {
			
			User = user1.getUser();
			String Password = user1.getPassword();
			
			Id_management.progress(User);
	
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			this.dispose();
				
			LookForProgress l = new LookForProgress();
			l.LookFor();
			
			WritingQuestions w = new WritingQuestions();
			w.writing();
			
			PrincipalPage welcome = new PrincipalPage();
			
			welcome.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(contentPane, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		
		}	
	}
}