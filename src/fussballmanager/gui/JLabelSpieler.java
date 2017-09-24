package fussballmanager.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fussballmanager.Position;

public class JLabelSpieler extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -980068552247733268L;
	// 0 SpielerA
	// 1 SpielerB
	// 2 Ball
	private static final ImageIcon spielerA = new ImageIcon("resources/nocoin.png");
	private static final ImageIcon spielerB = new ImageIcon("resources/coin.png");
	private static final ImageIcon ball = new ImageIcon("resources/nocoin.png");
	private static final ImageIcon[] icons = {spielerA,spielerB,ball};
	private int id;
	
	public JLabelSpieler(int id,Position p) {
		super(icons[id]);
		this.id = id;
		this.setBounds((int)p.x, (int)p.y, 10, 10);
	}
}
