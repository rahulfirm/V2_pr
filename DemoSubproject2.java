package subproject2;

import org.subproject2_A.App;
import java.io.Reader;

public class DemoSubproject2 { 

	int k;
	App app;
	
	public static void main(String[] args) {
		int k_subproject;
	}
	Reader reader = null;
	private static DemoSubproject2 fook = null;

	public static DemoSubproject2 getFook() { 
		
		 
		if (fook==null) {
			fook = new DemoSubproject2();
		}                       
		return fook;
	}

	
	
	public static int getIntValue() {
	int k = 58; 
	return k;	
	}
	
	public void x(){
		System.out.println("text");
		System.out.println("text");
		try{
			
		System.out.println("inside try");
		}
		catch(Exception ex){
			
		System.out.println("error");
		}
		
		
	}
	
}
