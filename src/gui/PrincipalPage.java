package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import businessLogic.Classification;
import businessLogic.ProgressCompute;
import businessLogic.ReadingQuestions;
import businessLogic.WriteProgress;
import data.Question;
import levels.ArtModule;
import levels.BiologyModule;
import levels.GeometryModule;
import levels.ScienceModule;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.FlowLayout;

public class PrincipalPage extends JFrame {

	private JPanel contentPane;

	
	public static Question CurrentQuestion;
	public static String CurrentAnswer;
	public static String CurrentOptionA;
	public static String CurrentOptionB;
	public static String CurrentOptionC;
	public static String CurrentOptionD;
	
	public static String CurrentModule; 
	
	private String file;
	
	
	private int artP;
	private int bioP;
	private int sciP;
	private int geoP;
	
	public PrincipalPage() {
		
		/*creamos un objeto de tipo readingQuestions para que cree las listas con preguntas 
		 * de cada categoria*/
		
		file = "questions.txt";
		
		//System.out.println(file);
		//System.out.println(Login.id);
		//System.out.println(file + Login.id);
		
		ReadingQuestions r = new ReadingQuestions(file + Login.id  );
		r.readingRecords();

		/*una vez tengamos las listas con preguntas de cada categoria se las enviamos
		 * al clasificador de preguntas para que cree listas de preguntas de cada categoria 
		 * clasificadas por nivel*/
		Classification c = new Classification();
		
		/*ordenamos las preguntas dependiendo del nivel de dificultad*/
		c.artQuestionClassifier(r.getArtQuestions());
		c.biologyQuestionClassifier(r.getBiologyQuestions());
		c.scienceQuestionClassifier(r.getScienceQuestions());
		c.geometryQuestionClassifier(r.getGeometryQuestions());
	
	
		/*porcentaje de avance por categoria*/
		
		ProgressCompute pc = new ProgressCompute();
		pc.artProgress(c.getArtQuestionsL1(), c.getArtQuestionsL2());
		pc.geometryProgress(c.getGeometryQuestionsL1(), c.getGeometryQuestionsL2());
		pc.biologyProgress(c.getBiologyQuestionsL1(), c.getBiologyQuestionsL2());
		pc.scienceProgress(c.getScienceQuestionsL1(), c.getScienceQuestionsL2());
		
		artP = pc.artProgress(c.getArtQuestionsL1(), c.getArtQuestionsL2());
		bioP = pc.biologyProgress(c.getBiologyQuestionsL1(), c.getBiologyQuestionsL2());
		geoP = pc.geometryProgress(c.getGeometryQuestionsL1(), c.getGeometryQuestionsL2());
		sciP = pc.scienceProgress(c.getScienceQuestionsL1(), c.getScienceQuestionsL2());

		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo (null);
		
		JLabel lblNewLabel_7 = new JLabel("ART");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(308, 95, 51, 44);
		contentPane.add(lblNewLabel_7);
		/*crear evento al seleccionar el modulo*/
		
		
		JLabel lblNewLabel_7_3 = new JLabel("SCIENCE");
		lblNewLabel_7_3.setForeground(Color.WHITE);
		lblNewLabel_7_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblNewLabel_7_3.setBackground(Color.WHITE);
		lblNewLabel_7_3.setBounds(283, 379, 114, 44);
		contentPane.add(lblNewLabel_7_3);
		/*crear evento al seleccionar el modulo*/
		
		JLabel lblNewLabel_7_2 = new JLabel("BIOLOGY");
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblNewLabel_7_2.setBackground(Color.WHITE);
		lblNewLabel_7_2.setBounds(661, 95, 116, 44);
		contentPane.add(lblNewLabel_7_2);
		/*crear evento al seleccionar el modulo*/
		
		JLabel lblNewLabel_7_1 = new JLabel("GEOMETRY");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblNewLabel_7_1.setBackground(Color.WHITE);
		lblNewLabel_7_1.setBounds(653, 379, 141, 44);
		contentPane.add(lblNewLabel_7_1);
		/*crear evento al seleccionar el modulo*/
		
		
		JButton btnNewButton = new JButton("");
	
		btnNewButton.setRolloverIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1ART2.png")));
		btnNewButton.setRolloverSelectedIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1ART.png")));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1ART.png")));
		btnNewButton.setBounds(204, 129, 263, 239);
		contentPane.add(btnNewButton);
		/*crear evento al seleccionar el modulo arte*/
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArtModule m = new ArtModule(c.getArtQuestionsL1(), c.getArtQuestionsL2());
				CurrentModule = "Art"; 
				m.setVisible(true);
				close();
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("");
		
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setRolloverSelectedIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1BIO.png")));
		btnNewButton_1.setRolloverIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1BIO2.png")));
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1BIO.png")));
		btnNewButton_1.setBounds(585, 129, 263, 239);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BiologyModule m = new BiologyModule(c.getBiologyQuestionsL1(), c.getBiologyQuestionsL2());
				CurrentModule = "Biology"; 
				m.setVisible(true);
				close();
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		
		btnNewButton_2.setRolloverSelectedIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1FIS.png")));
		btnNewButton_2.setRolloverIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1FIS2.png")));
		btnNewButton_2.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1FIS.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBounds(205, 405, 262, 238);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ScienceModule m = new ScienceModule(c.getScienceQuestionsL1(), c.getScienceQuestionsL2());
				CurrentModule = "Science"; 
				m.setVisible(true);
				close();
			}
		});
		
		JButton btnNewButton_3 = new JButton("");
		
		btnNewButton_3.setRolloverSelectedIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1GEO.png")));
		btnNewButton_3.setRolloverIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1GEO2.png")));
		btnNewButton_3.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/1GEO.png")));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(596, 405, 262, 238);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeometryModule m = new GeometryModule(c.getGeometryQuestionsL1(), c.getGeometryQuestionsL2());
				CurrentModule = "Geometry"; 
				m.setVisible(true);
				close();
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/fonfo.jpg")));
		lblNewLabel_3.setBounds(0, 75, 1031, 579);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 51, 0));
		panel.setBounds(0, 0, 1031, 74);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel logoYnombre = new JPanel();
		panel.add(logoYnombre);
		logoYnombre.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PrincipalPage.class.getResource("/images/logo.jpg")));
		logoYnombre.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("EXPLORA");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		logoYnombre.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ACADEMY");
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		logoYnombre.add(lblNewLabel_2);
		
		JPanel infoUsuario = new JPanel();
		panel.add(infoUsuario);
		infoUsuario.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel(Login.User);
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		infoUsuario.add(lblNewLabel_5, BorderLayout.EAST);
		
		JPanel menu = new JPanel();
		panel.add(menu);
		menu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		menu.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 22));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Statistics");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.print(pc.getArtProgress());
				/*crear nuevo frame que muestre las estadisticas del usuario*/
				UserStatistics us = new UserStatistics(artP, bioP, sciP, geoP);
				close();
				us.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	
	public void close() {
		this.dispose();
	}
}
