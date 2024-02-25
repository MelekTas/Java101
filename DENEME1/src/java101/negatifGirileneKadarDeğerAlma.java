package java101;
import java.util.Scanner;
public class negatifGirileneKadarDeğerAlma {

	public static void main(String[] args) {
		
		int sayi;
		Scanner input=new Scanner(System.in);
		
		for(boolean run=true;run==true;) {
			
			System.out.print("Sayı Giriniz :");
			sayi=input.nextInt();
			
			if(sayi<0) {
				run=false;
				System.out.println("Negatif sayi Girdiniz.!");
			}
		}
		
		
		
		

	}

}
