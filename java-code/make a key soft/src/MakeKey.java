
import acm.program.*;

public class MakeKey extends ConsoleProgram{
	
	public void run(){
		String result=makeAKey();
		
		println("���ܺ���ı�����Ҫ���߱���Ŷ~):"+result);
	}
	private String makeAKey(){
		String result="";
		int key=readInt("���������Կ������:");
		String line=readLine("������������ģ�");
		for(int i=0;i<line.length();i++){
			char ch=line.charAt(i);
			ch=(char)(ch+key);
			result+=ch;
		}
			return result;
			
}
	}

