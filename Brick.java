package breakout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import utilities.GDV5;

public class Brick extends Rectangle{
	
	boolean partEff = false;
	boolean broken = false;
	private static Brick[] bricks;
	Color col;
	private int w;
	Ball b;
	boolean incremented = false;
	
	
	public Brick(int x, int y, Color c) {
		super(x,y,GDV5.getMaxWindowX()/8-2,20);
		col = c;
	}
	public Brick(int x, int y, int w2, int h) {
		super(x,y,w2,h);
	}
	public void Draw(Graphics2D br) {
		br.setColor(col);
		br.fill(this);
		
	}
	public static void drawBricks(Graphics2D br, Brick[] bricks) {
		for (int i =0; i<bricks.length;i++) {
			if (bricks[i].broken==false) {
			bricks[i].Draw(br);
			}
		}
		for (int i = 0; i<bricks.length;i++) {
			if (bricks[i].broken==true&&bricks[i].partEff==false) {
				
			}
		}
		
	}
	public void Collision(Ball b1) {
		if ((broken == false)&&(b1.intersects(this))) {
			if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==0) {
				b1.dirx*=-1;
				broken=true;
			}
			else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==1) {
				b1.diry*=-1;
				broken=true;
			}
			else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==2) {
				b1.dirx*=-1;
				broken=true;
			}
			else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==3) {
				b1.diry*=-1;
				broken=true;
			}
		}
	}
}
