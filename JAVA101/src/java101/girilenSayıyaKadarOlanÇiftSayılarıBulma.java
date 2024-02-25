package java101;
import java.util.Scanner;

public class girilenSayıyaKadarOlanÇiftSayılarıBulma {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	int n1,n2,adet = 0;
	
	System.out.print("1.sayıyı giriniz:");
	n1=input.nextInt();
	
	System.out.print("2.sayıyı giriniz :");
	n2=input.nextInt();
	
	for(int i=n1;i<n2;i++) {
		
		if(i%2==0) {
			
			
			System.out.print(i+",");
			
			
		}
		
		
	}
	
		
	}

}
