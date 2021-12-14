package com.peculiar.jcinf; 

public class Main{
	static void find(Class classObject){
		System.out.println("FIELDS:");
		for(var s: classObject.getFields()) System.out.println(s);
		
		System.out.println("\nDECLARED FIELDS:");
		for(var s: classObject.getDeclaredFields()) System.out.println(s);

		System.out.println("\nCONSTRUCTORS:");
		for(var s: classObject.getConstructors()) System.out.println(s);
		
		System.out.println("\nMETHODS:");
		for(var s: classObject.getMethods()) System.out.println(s);
		
		System.out.println("\nDECLARED METHODS:");
		for(var s: classObject.getDeclaredMethods()) System.out.println(s);
		
		System.out.println("\nINTERFACES: ");
		for(var s: classObject.getInterfaces()) System.out.println(s);
		
		System.out.println("\nCLASSES:");
		for(var s: classObject.getClasses()) System.out.println(s);
		
		System.out.println("\nNEST MEMBERS:");
		for(var s: classObject.getNestMembers()) System.out.println(s);
	}
	public static void main(String[] argv) throws Exception{
		if(argv.length!=0){
			String className = argv[0];
			try{
				var scan = Class.forName(className);
				find(scan);
			}catch(ClassNotFoundException ex){
				System.out.println(className + " not Found!");
			}
			System.exit(0);
		}
		System.out.print("\tjinfo <package.className>");
		System.exit(0);
	}
}