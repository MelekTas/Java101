package metotlar;
import java.util.Scanner;
public class Gelişmiş_Hesap_Makinesi {

	
	static int sum(int a,int b) {
		
		int result=a+b;
		System.out.println("Sonuç:"+result);
		return result;
	}
	static int minus(int a,int b) {
		int result=a-b;
		System.out.println("Sonuç:"+result);
		return result;
	}
	
	static int times(int a,int b) {
		
		int result=a*b;
		System.out.println("Sonuç:"+result);
		return result;
	}
	static int divided(int a,int b) {
		if(b==0) {
			System.out.println("2. sayı 0'dan farklı olmalıdır.");
			return 0;
		}
		int result =a/b;
		System.out.println("Sonuç:"+result);
		return result;
		
	}
	
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result *=a;
		}
		System.out.println("Sonuç:"+result);
		return result;
	}
	
	static double mod(double a,double b) {
		
		double  result=a%b;
		System.out.println("Sonuç:"+result);
		return result;
	}
	static int alanCevre(int a, int b) {
		
	  System.out.println("Çevresi:"+(2*(a+b)));
      System.out.println("Alan:"+(a*b));
	return 1;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int select;
		
		String menu="1->Toplama\n"
				    +"2->Çıkarma\n"
				    +"3->Çarpma\n"
				    +"4->Bölme\n"
				    +"5->Mod Alma\n"
				    +"6->Dikdörtgen Alan ve Çevre Hesabı\n"
				    +"7->Üs Alma\n"
		            +"0->Çıkış Yap";
		
		      System.out.println(menu);
		
		   do {
			   System.out.print("Bir işlem seçiniz:");
			   select=scan.nextInt();
               System.out.print("İlk sayı :");
               int a=scan.nextInt();
		       System.out.print("İkinci sayi:");
		       int b=scan.nextInt();
		       
		
		   switch(select) {
		 
		 case 1:
			 sum(a,b);
			 break;
		 case 2:		 
		     minus(a,b);
		     break;
		 case 3:    
		    times(a,b);
		    break;
		 case 4:
			 divided(a,b);
			 break;
		 case 5:
			 mod(a,b);
			 break;
		 case 6:
			 alanCevre(a,b);
			 break;
		 case 7:
			 power(a,b);
			 break;
			 
	     default:
		    System.out.println("Geçersiz işlem girdiniz!");
		 
		 }
		}
		
      while(select!=0);
		 
		 
		}
	

}

		
		
	

