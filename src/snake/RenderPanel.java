package snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RenderPanel extends JPanel {
	
	public static int curColor = 0;

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(curColor));
		g.fillRect(0, 0, 800, 700);
		curColor++;
		
	}
	
	

}
