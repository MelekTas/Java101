package metotlar;
import java.util.Scanner;
public class Metot_Örnek {

	static int power(int base,int exp) { // parametrelerin sıralamaları önemli
		
		int result=1;
		for(int i=1;i<=exp;i++) {
			
			result*=base;	
		}
		
		return result;
		// return e yazdığımız değer çok önemli.
		//return 1; yazsak istediğimiz kadar işlem yapalım sonuç 1 çıkıcak.
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int s1,s2;
		System.out.print("1.sayı girişi:");
		s1=scan.nextInt();
		System.out.print("2.sayı girişi:");
		s2=scan.nextInt();
		
		int sonuc=power(s1,s2);
		System.out.println("Sonuç:"+sonuc);
		
		

	}

}
