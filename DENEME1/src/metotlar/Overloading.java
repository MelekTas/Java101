package metotlar;

public class Overloading {

	static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

	public static void main(String[] args) {
		
		    ekranaYaz(5);     //bu tek parametreli olduğu için tek parametreli ekranaYaz metodunda çalışacak.
	        ekranaYaz(10, 2);// bu iki parametresi olduğu için iki parametre alan ekranaYaz metodunda çalışacak. 
	}
		
		
	   
	}

	

