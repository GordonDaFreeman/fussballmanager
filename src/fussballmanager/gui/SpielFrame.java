package fussballmanager.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fussballmanager.Spiel;
import fussballmanager.personen.Spieler;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;

public class SpielFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6668792380368209035L;
	private JPanel contentPane;
	private JPanel feld;
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
		
		feld = new JPanel();
		feld.setBackground(new Color(34, 139, 34));
		feld.setMinimumSize(new Dimension(size*90, size*45));
		feld.setMaximumSize(new Dimension(size*90, size*45));
		feld.setBounds(10, 10, size*90, size*45);
		contentPane.add(feld);
		feld.setLayout(null);
	}
	
	public void refresh() {
		feld.removeAll();
		for(Spieler s:spiel.heimteam.spieler) {
			feld.add(new JLabelSpieler(0, s.p));
		}
	}
}
