package fussballmanager.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
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
		setBounds(100, 100, 937, 511);
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
		JLabel test = new JLabel(new ImageIcon("resources/spielerA.png"));
		test.setBounds((int)45*size, (int)20*size, 10, 10);
		contentPane.add(test);
	}
	
	public void refresh() {
		feld.removeAll();
		for(Spieler s:spiel.heimteam.spieler) {
			JLabelSpieler tmp = new JLabelSpieler(0, s.p);
			tmp.setBounds((int)s.p.x*size, (int)s.p.y*size, 10, 10);
			feld.add(tmp);
		}
		
		for(Spieler s:spiel.auswärtsteam.spieler) {
			JLabelSpieler tmp = new JLabelSpieler(1, s.p);
			tmp.setBounds((int)s.p.x*size, (int)s.p.y*size, 10, 10);
			feld.add(tmp);
		}
		JLabelSpieler tmp = new JLabelSpieler(2, spiel.b.s.p);
		tmp.setBounds((int)spiel.b.s.p.x*size-5, (int)spiel.b.s.p.y*size-5, 10, 10);
		feld.add(tmp);
		this.invalidate();
		this.validate();
		this.repaint();
	}
}
