import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class BouncingBall extends GraphicsProgram {
	/**every cycle its increased by3
	 */
	private static final int Gravity=3;
	
	private static final int DIAM_BALL=80;
	
	/**some delay for bouncing ball
	 */
	
	private static final int Delay =50;
	
	/**the starting X and Y location of ball
	 * 
	 */
    
	private static final int X_START=0;
	
	private static final int Y_START=100;
	
	/**X Velocity
	 */
	private static final int X_VEL=8;
	
	/** it keeps 90 percent of its speed*/
	
	private static final double BOUNCE_REDUCE=0.9;
	
	/**Starting X and Y Velocities*/
	
	private static final double xVel=X_VEL;
    
	private static double yVel=0.0;

	private GOval ball;
	
	public void run(){
		setup();
		while(ball.getX() < getWidth()){
			moveBall();
			checkForCollision();
			pause(Delay);
		}
	}
	
	private void checkForCollision() {
		// TODO Auto-generated method stub
		if(ball.getY()>getHeight()-DIAM_BALL){
			
			ball.setColor(rgen.nextColor());
			ball.setFilled(true);
			
			yVel=-yVel*BOUNCE_REDUCE;
			
			double diff=ball.getY()-(getHeight()-DIAM_BALL);
			ball.move(0,-2*diff);
		}
	}
	private void setup(){
		ball=new GOval(X_START,Y_START,DIAM_BALL,DIAM_BALL);
		ball.setColor(Color.cyan);
		ball.setFilled(true);
		add(ball);
	}
	private void moveBall() {
		// TODO Auto-generated method stub
		yVel +=  Gravity;
		ball.move(xVel,yVel);
		
	}
	private RandomGenerator rgen=RandomGenerator.getInstance();
	
}
