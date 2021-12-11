package breakout;
import java.awt.Rectangle;
import java.awt.Stroke;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
public class PowerUps extends JProgressBar{
	public PowerUps() {
		super();
	}
	public void drawRectangles(Graphics2D g) {
	    Graphics2D g2d = (Graphics2D) g;
	    int x = 20;
	    int y = 500;
	    int width = 25;
	    int height = 200;
	     
	    Stroke stroke1 = new BasicStroke(6f);
	     
	    g2d.setColor(Color.white);
	    g2d.setStroke(stroke1);
	    g2d.drawRect(x, y, width, height);
	     
	   
	 
	}
}
