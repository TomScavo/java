import java.applet.*;
import java.awt.print.Printable;

import acm.graphics.*;
import acm.program.ConsoleProgram;
public class UpperCase extends ConsoleProgram{
	   public void run(){
		
		   String result=toLowerCase();
		   
		   println ("Сд�汾Ϊ:"+result+".");
		   }
	   

private String toLowerCase(){
	
	String result="";
	
	String line= readLine("�������ı�:");
	
	for(int i=0;i<line.length();i++){
		char ch=line.charAt(i);
		if(Character.isUpperCase(ch)){
		ch=(char) (ch-'A'+'a');
		}
		result+=ch;
		}
return result;
}
}
