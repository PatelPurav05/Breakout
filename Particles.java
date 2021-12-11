package breakout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Particles extends Brick{
	static Particles[] particles;
	private int dX, dY;
	public Particles(int x, int y, int w, int h) {
		super(x,y,w,h);
	}
	public void makeParticles(Brick b) {

		particles = new Particles[40];
		int x  = (int)(b.getX());
		int y = (int)(b.getY());
		int partPerRow = 8;
		int rowPerArr = 5;
		for (int i = 0; i<particles.length;i++) {
			
		}
	}
		
	public void draw(Graphics2D pb) {
		pb.setColor(Color.white);
		pb.fill(this);
	}
	public static void drawParticles(Graphics2D pb) {
		for (Particles p: particles) {
			p.draw(pb);
		}
	}
}
