package boksMaçı;

public class Main {
     public static void main(String[] args) {
		
    	 
    Fighter f1=new Fighter("Melek",20,100,60);
    Fighter f2=new Fighter("Okan",15,100,85);
    		
    Match match=new Match (f1,f2,50,100);
    match.run();
    	 
    	 
	}
	
}
 