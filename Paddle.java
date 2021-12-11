package breakout;
import utilities.GDV5;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
public class Paddle extends Rectangle {
	public Paddle(int x, int y, int w, int h) {
		super(x,y,w,h);
	}
	public void move() {
if (GDV5.KeysPressed[KeyEvent.VK_A]&&this.getX()>0) {
	this.translate(-10, 0);
}
if(GDV5.KeysPressed[KeyEvent.VK_D]&&this.getX()<GDV5.getMaxWindowY()-300) {
	this.translate(10, 0);
}
	}
	public void Collision(Ball b1) {
	if ((b1.intersects(this))) {
		if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==0) {
			b1.dirx*=-1;
		}
		else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==1) {
			b1.diry*=-1;
		}
		else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==2) {
			b1.dirx*=-1;
		}
		else if (GDV5.collisionDirection(this, b1, b1.dX, b1.dY)==3) {
			b1.diry*=-1;
		}
	}
	}
}
