package levels;

import businessLogic.*;
import data.Question;
import gui.ShowQuestion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import gui.PrincipalPage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
public class ScienceModule extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	


	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */

	
	
	
	public ScienceModule(ArrayList<Question> scienceQuestionsL1, ArrayList<Question> scienceQuestionsL2) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 432);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo (null);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		btnNewButton_2.setBounds(310, 318, 89, 23);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFocusPainted(false);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalPage w = new PrincipalPage();
				close();
				w.setVisible(true);
			}
		});
		
		
		lblNewLabel = new JLabel("WELCOME TO THE SCIENCE MODULE");
		lblNewLabel.setBounds(10, 25, 700, 62);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		/*programacion de evento*/
		
		JLabel lblNewLabel_1 = new JLabel("Select a difficulty level");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(174, 118, 404, 42);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		
		JButton btnNewButton_1 = new JButton("LEVEL 1");
		btnNewButton_1.setForeground(SystemColor.info);
		btnNewButton_1.setBounds(74, 182, 280, 70);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(51, 153, 204));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		
		
		
		JButton btnNewButton = new JButton("LEVEL 2");
		btnNewButton.setForeground(SystemColor.info);
		btnNewButton.setBounds(387, 182, 280, 70);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(51, 153, 204));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(BiologyModule.class.getResource("/images/science.jpg")));
		lblNewLabel_2.setBounds(0, 0, 722, 395);
		contentPane.add(lblNewLabel_2);
		
		/*programacion de evento*/
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtModule.CurrentLevel = 1;
				try {
					
					QuestionSelector s = new QuestionSelector();
					Question q = s.selector(scienceQuestionsL1);
					/*una vez sea seleccionada la pregunta aleatoria se crea
					 * la ventana que muestra la informacion de la pregunta*/
					
					ShowQuestion sq = new ShowQuestion("Science Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					
					ShowQuestion.currentLine = String.valueOf( "science, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					
					
					close();
					sq.setVisible(true);
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(contentPane,  "YA HAS TERMINADO ESTE NIVEL");
					
				}
			}
		});
		
		

		/*programacion de evento*/
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				ArtModule.CurrentLevel = 2;
				try {
					
					QuestionSelector s = new QuestionSelector();
					Question q = s.selector(scienceQuestionsL2);
					/*una vez sea seleccionada la pregunta aleatoria se crea
					 * la ventana que muestra la informacion de la pregunta*/
					
					ShowQuestion sq = new ShowQuestion("Science Module", q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					
					ShowQuestion.currentLine = String.valueOf( "science, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					
					
					
					close();
					sq.setVisible(true);
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(contentPane,  "YA HAS TERMINADO ESTE NIVEL");
					
				}
			}
		});
		
		
	}

	
	public void close() {
		this.dispose();
	}
	
	
}
