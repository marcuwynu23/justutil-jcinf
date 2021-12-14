
import java.io.File;

public class Test{
	static void listFiles(String loc){
		for(String n: new File(loc).list()){
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		if(args.length!=0){
			String loc = args[0];
			listFiles(loc);
		}
		listFiles(".");
	}
} 
