package breakout;

import java.awt.Rectangle;

import utilities.GDV5;

public class Ball extends Rectangle{
	int scorep;
	int lives = 5;
	int countDownStarter;
	Paddle p1;
	Ball b1;
	int dX;
	int dY;
	int dirx = 1;
	int diry = 1;
	int speedx = 7;
	int speedy = 7;
	int powerLives = 1;
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		
	}
	//autonomous ball movement
	public void move() {
		dX = dirx * speedx;
		dY = diry * speedy;
		this.translate(dX,dY);

	}
	//the bounce method allows for the ball to change directions when it "hits" the borders of the game
	public void bounce() {

		if (this.getY() >= GDV5.getMaxWindowY()-20) {
			this.x=GDV5.getMaxWindowX()/2;
			this.y=GDV5.getMaxWindowY()/2;
			lives--;
		
		}
		if ((this.getY()<=0)) {
			diry*=-1;
			
		}
		if (this.getX() >= GDV5.getMaxWindowX()||(this.getX()<=0)) {
		dirx*=-1;
		}
		//the resetBall method resets the ball to the center of the field and waits three seconds before setting the speed of the ball back to the original state

}
	public void bounce2() {

		if (this.getY() >= GDV5.getMaxWindowY()-20) {
			this.x=GDV5.getMaxWindowX()/2;
			this.y=GDV5.getMaxWindowY()/2;
			powerLives--;
		
		}
		if ((this.getY()<=0)) {
			diry*=-1;
			
		}
		if (this.getX() >= GDV5.getMaxWindowX()||(this.getX()<=0)) {
		dirx*=-1;
		}
		//the resetBall method resets the ball to the center of the field and waits three seconds before setting the speed of the ball back to the original state

}}
