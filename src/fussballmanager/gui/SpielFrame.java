package fussballmanager.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fussballmanager.Spiel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;

public class SpielFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6668792380368209035L;
	private JPanel contentPane;
	private JPanel panel;
	private Spiel spiel;
	private static final int size = 10;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SpielFrame(Spiel sp) {
		spiel = sp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 432);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(size*90, size*45));
		contentPane.setMaximumSize(new Dimension(size*90, size*45));
		contentPane.setBounds(100, 100, size*90, size*45);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setMinimumSize(new Dimension(size*90, size*45));
		panel.setMaximumSize(new Dimension(size*90, size*45));
		panel.setBounds(10, 10, size*90, size*45);
		contentPane.add(panel);
		panel.setLayout(null);
	}
	
	public void refresh() {
		
	}
}
