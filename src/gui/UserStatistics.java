package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class UserStatistics extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public UserStatistics(int artProgress,int biologyProgress, int scienceProgress, int geometryProgress ) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(204, 102, 153));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSup = new JPanel();
		panelSup.setBackground(new Color(0, 153, 204));
		panelCentral.add(panelSup, BorderLayout.NORTH);
		panelSup.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Progress by category");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		panelSup.add(lblNewLabel);
		
		JPanel panelMed = new JPanel();
		panelCentral.add(panelMed, BorderLayout.CENTER);
		panelMed.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panelMed.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Art Module");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(54, 34, 139, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(artProgress+"%");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(554, 29, 89, 39);
		panel_1.add(lblNewLabel_2);
		
		JProgressBar ArtProgressBar = new JProgressBar();
		ArtProgressBar.setForeground(new Color(102, 255, 51));
		ArtProgressBar.setBounds(276, 34, 252, 28);
		panel_1.add(ArtProgressBar);
		ArtProgressBar.setValue(artProgress);
		
		JPanel panel_2 = new JPanel();
		panelMed.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Science Module");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_3.setBounds(54, 30, 189, 34);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(scienceProgress+"%");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_4.setBounds(553, 30, 90, 43);
		panel_2.add(lblNewLabel_4);
		
		JProgressBar ScienceProgressBar = new JProgressBar();
		ScienceProgressBar.setForeground(new Color(102, 255, 51));
		ScienceProgressBar.setBounds(276, 36, 252, 28);
		panel_2.add(ScienceProgressBar);
		ScienceProgressBar.setValue(scienceProgress);
		
		JPanel panel_3 = new JPanel();
		panelMed.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Biology Module");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_5.setBounds(56, 36, 192, 34);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(biologyProgress+"%");
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_6.setBounds(553, 36, 91, 34);
		panel_3.add(lblNewLabel_6);
		
		JProgressBar BiologyProgressBar = new JProgressBar();
		BiologyProgressBar.setForeground(new Color(102, 255, 51));
		BiologyProgressBar.setBounds(278, 42, 252, 28);
		panel_3.add(BiologyProgressBar);
		BiologyProgressBar.setValue(biologyProgress);
		
		JPanel panel = new JPanel();
		panelMed.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Geometry Module");
		lblNewLabel_7.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_7.setBounds(55, 35, 216, 34);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(geometryProgress+"%");
		lblNewLabel_8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_8.setBounds(556, 37, 99, 30);
		panel.add(lblNewLabel_8);
		
		JProgressBar GeometryProgressBar = new JProgressBar();
		GeometryProgressBar.setForeground(new Color(102, 255, 51));
		GeometryProgressBar.setBounds(275, 41, 252, 28);
		panel.add(GeometryProgressBar);
		GeometryProgressBar.setValue(geometryProgress);
		
		JPanel panelInf = new JPanel();
		panelInf.setBackground(new Color(0, 153, 204));
		panelCentral.add(panelInf, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalPage w = new PrincipalPage();
				close();
				w.setVisible(true);
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		panelInf.add(btnNewButton);
		setLocationRelativeTo (null);
		
	}

	public void close() {
		this.dispose();
	}
}