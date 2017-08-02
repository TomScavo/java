
import acm.program.*;

public class MakeKey extends ConsoleProgram{
	
	public void run(){
		String result=makeAKey();
		
		println("加密后的文本（不要告诉别人哦~):"+result);
	}
	private String makeAKey(){
		String result="";
		int key=readInt("请输入你的钥匙密码:");
		String line=readLine("请输入你的论文：");
		for(int i=0;i<line.length();i++){
			char ch=line.charAt(i);
			ch=(char)(ch+key);
			result+=ch;
		}
			return result;
			
}
	}

