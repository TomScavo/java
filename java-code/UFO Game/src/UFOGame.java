import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.*;
import java.awt.event.*;
public class UFOGame extends GraphicsProgram{
	
	private static final int WIDTH_UFO=60;
	
	private static final int HEIGHT_UFO=25;
	
	private static final int DIAM_BULLET=10;
	
	private static  int VEL_UFO=10;
	
	private static final int Delay=30;
	
	private static final int VEL_Bullet=80;
	
	
	
	
	
	public void run (){
		
		setup();
		
		while(!gameover()){
			
		moveUFO();
		
		moveBullet();
		
		checkForCollision();
		
		pause(Delay);
	  }
	}
		//*This is the UFO and Bullet
		
	GRect UFO;
	
	private GOval Bullet;
	
	private void setup(){
		UFO = new GRect (getWidth()-WIDTH_UFO,0,WIDTH_UFO,HEIGHT_UFO);
		
		UFO.setFilled(true);
		
		UFO.setFillColor(Color.GRAY);
		
		Bullet = new GOval (960,1080,DIAM_BULLET,DIAM_BULLET);
		
		Bullet.setFilled(true);
		
		add(UFO);
		
		
		addMouseListeners();
		
		
	}
	public void mouseClicked(MouseEvent e){
Bullet = new GOval (getWidth()/2,getHeight(),DIAM_BULLET,DIAM_BULLET);
		
		Bullet.setFilled(true);
		Bullet.setFillColor(Color.BLACK);
		add(Bullet);
	}
	
	private boolean gameover(){
			
	return (UFO.getY()>=getHeight()-HEIGHT_UFO);
		}
	private void moveUFO(){
		
		UFO.move(-VEL_UFO, 0);
				
			}
	private void moveBullet(){
		
		Bullet.move(0, -VEL_Bullet);
		
		
		
	}
	private void checkForCollision(){
		if(UFO.getX()<0){
			VEL_UFO=-VEL_UFO;
			UFO.move(0, HEIGHT_UFO);
		}
			if(UFO.getX()>getWidth()-WIDTH_UFO){
				VEL_UFO=-VEL_UFO;
				UFO.move(0, HEIGHT_UFO);
			}
				if((Bullet.getY()-UFO.getY()<=HEIGHT_UFO&& Bullet.getY()-UFO.getY()>0&& Bullet.getX()-UFO.getX()>0&&Bullet.getX()-UFO.getX()<WIDTH_UFO)){
					removeAll();
				}
				
				
			}
		
	}
	
	

