package java101;
import java.util.Scanner;

//Java ile girilen sayının harmonik serisini bulan program yazacağız.
public class HarmonikSeriBulma {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		n=scan.nextInt();
		
		double result=0;
		for(int i=1;i<=n;i++) {
			
			result=result+(1.0/i); //1.0 yazıyoruz çünkü int/double doğru sonuç vermeyebilir.
			
		}
		
		System.out.println("Sonuç:"+result);
		
		
	}

}
