package java101;
import java.util.Scanner;
public class TekSayılarınToplamınıBulma {
//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
//ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num,sum=0;
		
		for(boolean run =true;run == true;) {

			System.out.print("Lütfen bir sayı giriniz:");
			num=input.nextInt();
			if(num<0) {
				run=false;
			}
			else {
			
				if(num%2!=0) {
					sum +=num;
					
				}
				
				
			}
		
			
		}
		
		System.out.println("Toplam: "+sum);
}
}