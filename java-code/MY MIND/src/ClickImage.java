import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;




public class ClickImage extends GraphicsProgram{
	public static void main (String args[]) {
	}
	
	 
	
	
	public void init(){
		addMouseListeners();
	}
	
	
	public void mouseClicked(MouseEvent e){
	
	GImage image = new GImage ("�ɰ��Ľ���.jpg");
	
	add(image,e.getX(),e.getY());
	

 }
}
