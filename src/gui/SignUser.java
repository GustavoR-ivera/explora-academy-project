package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.User;
import maintenance.Sign_management;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SignUser extends JFrame {

	private JPanel contentPane;
	private JTextField newtext_user;
	private JTextField newtext_password;
	private JLabel lblNombreDeUsuario;
	private JLabel Password;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;



	public SignUser() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 463, 477);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo (null);
		
		newtext_user = new JTextField();
		newtext_user.setBounds(155, 165, 230, 25);
		contentPane.add(newtext_user);
		newtext_user.setColumns(10);
		
		newtext_password = new JTextField();
		newtext_password.setBounds(155, 215, 230, 25);
		contentPane.add(newtext_password);
		newtext_password.setColumns(10);
		
		JLabel User = new JLabel("New User:");
		User.setForeground(Color.WHITE);
		User.setFont(new Font("Agency FB", Font.BOLD, 30));
		User.setHorizontalAlignment(SwingConstants.CENTER);
		User.setBounds(50, 159, 95, 36);
		contentPane.add(User);
		
		JLabel Password = new JLabel("Password:");
		Password.setForeground(Color.WHITE);
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setFont(new Font("Agency FB", Font.BOLD, 30));
		Password.setBounds(50, 209, 98, 36);
		contentPane.add(Password);
		
		
		
		JButton btnRegistrarse_sign = new JButton("Register");
		btnRegistrarse_sign.setDefaultCapable(false);
		btnRegistrarse_sign.setFocusPainted(false);
		btnRegistrarse_sign.setBorderPainted(false);
		btnRegistrarse_sign.setBackground(Color.WHITE);
		btnRegistrarse_sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				sign_user();
			}
		});
		btnRegistrarse_sign.setFont(new Font("Californian FB", Font.BOLD, 25));
		btnRegistrarse_sign.setBounds(151, 302, 145, 40);
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
	
	private void sign_user() {
		
		String user = newtext_user.getText().toString();
		String password = newtext_password.getText().toString();
		
		User new_user = new User();
		new_user.setUser(user);
		new_user.setPassword(password);
		
		Sign_management new_sign = new Sign_management();
		int ok = new_sign.sign(new_user);
		
		if (ok > 0 ) {
			
			JOptionPane.showMessageDialog(contentPane, "Usuario Registrado exitosamente");
			this.dispose();
			Login login = new Login();
			login.setVisible(true);
			
		}else {
			
			JOptionPane.showMessageDialog(contentPane, "Usuario No registrado", "Aviso", JOptionPane.WARNING_MESSAGE);
		}
	}
}