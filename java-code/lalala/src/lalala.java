import acm.program.GraphicsProgram;


import acm.graphics.*;


public class lalala extends GraphicsProgram{
	public void run(){
	
	GPolygon i = createDiamond (1000,1000);
			
	add(i,1000,1000 );

 }

   
private GPolygon createDiamond (int Width,int Height ){
	GPolygon diamond=new GPolygon();
	diamond.addVertex(-Width/2,0);
	diamond.addVertex(0,-Height/2);
	diamond.addVertex(Width/2, 0);
	diamond.addVertex(0, Height/2);
	
	return diamond;
	
	
}
}