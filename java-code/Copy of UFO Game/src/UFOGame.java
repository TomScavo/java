import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.*;
import java.awt.event.*;
public class UFOGame extends GraphicsProgram{
	
	private static final int WIDTH_UFO=100;
	
	private static final int HEIGHT_UFO=133;
	
	private static final int DIAM_BULLET=10;
	
	private static  int VEL_UFO=10;
	
	private static final int Delay=30;
	
	private static final int VEL_Bullet=80;
	
	
	
	
	
	public void run (){
		
		setup();
		
		while(true){
			
		moveUFO();
		
		moveBullet();
		
		checkForCollision();
		
		pause(Delay);
	  }
	}
		//*This is the UFO and Bullet
		
	
	
	
	private GOval Bullet;
	private GImage Image;
	private void setup(){
		GImage Image = new GImage("�ɰ��Ľ���.jpg",getWidth()-WIDTH_UFO,0);
		
		Bullet = new GOval (960,1080,DIAM_BULLET,DIAM_BULLET);
		
		Bullet.setFilled(true);
		
		add(Image);
		
		
		addMouseListeners();
		
		
	}
	public void mouseClicked(MouseEvent e){
Bullet = new GOval (getWidth()/2,getHeight(),DIAM_BULLET,DIAM_BULLET);
		
		Bullet.setFilled(true);
		Bullet.setFillColor(Color.BLACK);
		add(Bullet);
	}
	
	private boolean gameover(){
			
	return (Image.getY()>=1080-HEIGHT_UFO);
		}
	private void moveUFO(){
		
		Image.move(-VEL_UFO, 0);
				
			}
	private void moveBullet(){
		
		Bullet.move(0, -VEL_Bullet);
		
		
		
	}
	private void checkForCollision(){
		if(Image.getX()<0){
			VEL_UFO=-VEL_UFO;
			Image.move(0, HEIGHT_UFO);
		}
			if(Image.getX()>getWidth()-WIDTH_UFO){
				VEL_UFO=-VEL_UFO;
				Image.move(0, HEIGHT_UFO);
			}
				if((Bullet.getY()-Image.getY()<=HEIGHT_UFO&& Bullet.getY()-Image.getY()>0&& Bullet.getX()-Image.getX()>0&&Bullet.getX()-Image.getX()<WIDTH_UFO)){
					removeAll();
					
				}
				
				
			}
		
	}
	
	

