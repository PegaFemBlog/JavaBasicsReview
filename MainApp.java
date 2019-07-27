package App;

public class MainApp {
	
	static aBeginning bg	 = new aBeginning();
	static projectGutenberg pg = new projectGutenberg();
	static CommentingCode cc = new CommentingCode();
	static AllTheMaths atm= new AllTheMaths();	
	
	public static void main(String[] args) {
		//calling simple method
		//to print out strings
		bg.simpleMethod();
		System.out.println("-----------------------------------------------------------------------------");
		
		pg.gutenberg(args);
		System.out.println("-----------------------------------------------------------------------------");
		
		cc.commenting();
		System.out.println("-----------------------------------------------------------------------------");
		
		cc.commenting();
		System.out.println("-----------------------------------------------------------------------------");
		
		atm.math();
		System.out.println("-----------------------------------------------------------------------------");
	}

}
