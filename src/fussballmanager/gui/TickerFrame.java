package fussballmanager.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fussballmanager.Spiel;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TickerFrame extends JFrame {

	private JPanel contentPane;
	private Spiel spiel;
	private String text;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TickerFrame(Spiel sp) {
		spiel = sp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		refresh();
	}
	
	public void addText(String text) {
		this.text = text+"\n"+this.text;
	}
	
	public void refresh() {
		contentPane.removeAll();
		
		JLabel lblLiveTicker = new JLabel("Live Ticker");
		lblLiveTicker.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblLiveTicker.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiveTicker.setBounds(10, 11, 414, 26);
		contentPane.add(lblLiveTicker);
		
		JLabel teamA = new JLabel(spiel.heimteam.name);
		teamA.setHorizontalAlignment(SwingConstants.CENTER);
		teamA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		teamA.setBounds(10, 48, 196, 26);
		contentPane.add(teamA);
		
		JLabel teamB = new JLabel(spiel.auswärtsteam.name);
		teamB.setHorizontalAlignment(SwingConstants.CENTER);
		teamB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		teamB.setBounds(228, 48, 196, 26);
		contentPane.add(teamB);
		
		JLabel punkteA = new JLabel(""+spiel.heimteam.tore);
		punkteA.setHorizontalAlignment(SwingConstants.CENTER);
		punkteA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		punkteA.setBounds(10, 85, 196, 26);
		contentPane.add(punkteA);
		
		JLabel punkteB = new JLabel(""+spiel.auswärtsteam.tore);
		punkteB.setHorizontalAlignment(SwingConstants.CENTER);
		punkteB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		punkteB.setBounds(228, 85, 196, 26);
		contentPane.add(punkteB);
		JTextArea textArea = new JTextArea(text);
		textArea.setBounds(10, 120, 414, 131);
		JScrollPane scrollBar = new JScrollPane(textArea);
		scrollBar.setBounds(10, 120, 414, 131);
		contentPane.add(scrollBar);
		this.invalidate();
		this.validate();
		this.repaint();
	}
}
