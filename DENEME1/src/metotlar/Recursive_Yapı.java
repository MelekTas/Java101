package metotlar;
import java.util.Scanner;
public class Recursive_Yapı {

	static int toplam(int k) {
		
		if(k>0) {
			
			return k+toplam(k-1); // fonksiyon kendi içerisinde kendini çağırıyor.(Recursive yapı)
			
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.print("Bir sayı giriniz:");
		n=scan.nextInt();
		
		int sonuc=toplam(n);
		System.out.print("Sonuç:"+sonuc);
		
		
	}

}
