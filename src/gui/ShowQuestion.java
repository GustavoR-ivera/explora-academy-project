package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import businessLogic.*;
import data.Question;
import levels.ArtModule;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.Color;

public class ShowQuestion extends JFrame {

	private JPanel contentPane;

	public static String currentLine;

	
	public ShowQuestion(String module, int level, String statement, String optionA, String optionB, String optionC, String optionD, String answer) {
		
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo (null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 665, 36);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		/*----------------------encabezado ventana------------------------------*/
		JLabel lblNewLabel = new JLabel(module);
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 30));
		panel.add(lblNewLabel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Level    ");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 25));
		panel_1.add(lblNewLabel_1);
		
		/*la etiqueta recibe como parametro el valor de level*/
		JLabel lblNewLabel_2 = new JLabel(level+"");
		lblNewLabel_2.setFont(new Font("Agency FB", Font.BOLD, 25));
		panel_1.add(lblNewLabel_2);
		
		/*----------------------------enunciado pregunta----------------------------------------*/
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 41, 665, 446);
		panel_2.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_2);
		
		/*la etiqueta recibe el valor del parametro*/
		panel_2.setLayout(null);
		JLabel lblNewLabel_3 = new JLabel(statement);
		lblNewLabel_3.setForeground(new Color(230, 230, 250));
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(0, 5, 665, 51);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 18));
		panel_2.add(lblNewLabel_3);
		
		/*-----------------------opciones de respuesta----------------------------------------*/
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(127, 255, 212));
		panel_3.setBounds(25, 58, 607, 343);
		panel_2.add(panel_3);
		
		/*programar eventos para indicar al usuario si la opcion seleccionada fue la correcta*/
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton(optionA);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkA();
				
			}
		});
		btnNewButton_1.setBounds(43, 11, 527, 72);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panel_3.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton(optionB);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkB();
			
			}
		});
		btnNewButton_2.setBounds(43, 94, 527, 72);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(optionC);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkC();
				
			}
		});
		btnNewButton_3.setBounds(43, 177, 527, 72);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton(optionD);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkD();
				
			}
		});
		btnNewButton.setBounds(43, 260, 527, 72);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalPage w = new PrincipalPage();
				close();
				w.setVisible(true);
			}
		});
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_4.setBounds(24, 401, 89, 34);
		panel_2.add(btnNewButton_4);
		
		
	}
	
	protected void checkA() {
		
		if (Objects.equals(PrincipalPage.CurrentOptionA,PrincipalPage.CurrentAnswer)) {
			
			JOptionPane.showMessageDialog(contentPane, "Excelente, respuesta correcta");
			this.dispose();
			
			
			DeleteCorrectAnswer deleteCorrectAnswer = new DeleteCorrectAnswer();
			deleteCorrectAnswer.removeLineFromFile(currentLine);
			this.dispose();
			
			NewQuestion Nq = new NewQuestion();
			Nq.SetNewQuestion(PrincipalPage.CurrentModule);
			//PrincipalPage welcome = new PrincipalPage();
			//welcome.setVisible(true);
			
			
		}else {
			JOptionPane.showMessageDialog(contentPane, "Respuesta Incorrecta");
		}
	}
	
	protected void checkB() {
		

		if (Objects.equals(PrincipalPage.CurrentOptionB,PrincipalPage.CurrentAnswer)) {
		
			
			JOptionPane.showMessageDialog(contentPane, "Excelente, respuesta correcta");
			this.dispose();
			
			DeleteCorrectAnswer deleteCorrectAnswer = new DeleteCorrectAnswer();
			deleteCorrectAnswer.removeLineFromFile(currentLine);
			
			NewQuestion Nq = new NewQuestion();
			Nq.SetNewQuestion(PrincipalPage.CurrentModule);
			//PrincipalPage welcome = new PrincipalPage();
			//welcome.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(contentPane, "Respuesta Incorrecta");

			
		}
		
	}
	protected void checkC() {
		

		if (Objects.equals(PrincipalPage.CurrentOptionC,PrincipalPage.CurrentAnswer)) {
			
			JOptionPane.showMessageDialog(contentPane, "Excelente, respuesta correcta");
			this.dispose();
			
			DeleteCorrectAnswer deleteCorrectAnswer = new DeleteCorrectAnswer();
			deleteCorrectAnswer.removeLineFromFile(currentLine);

			NewQuestion Nq = new NewQuestion();
			Nq.SetNewQuestion(PrincipalPage.CurrentModule);
			//PrincipalPage welcome = new PrincipalPage();
			//welcome.setVisible(true);
			

		}else {
			JOptionPane.showMessageDialog(contentPane, "Respuesta Incorrecta");
		}
		
	}
	protected void checkD() {
		
		
		if (Objects.equals(PrincipalPage.CurrentOptionD,PrincipalPage.CurrentAnswer)) {
			
			
			JOptionPane.showMessageDialog(contentPane, "Excelente, respuesta correcta");
			this.dispose();
			
			DeleteCorrectAnswer deleteCorrectAnswer = new DeleteCorrectAnswer();
			deleteCorrectAnswer.removeLineFromFile(currentLine);

			NewQuestion Nq = new NewQuestion();
			Nq.SetNewQuestion(PrincipalPage.CurrentModule);
			//PrincipalPage welcome = new PrincipalPage();
			//welcome.setVisible(true);
			
			
		}else {
			JOptionPane.showMessageDialog(contentPane, "Respuesta Incorrecta");
		}		
	}
	
	public void close() {
		this.dispose();
	}
}