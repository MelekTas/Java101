package java101;
import java.util.Scanner;
public class faktöriyelHesaplama {
 // kullanıcının belirlediği sayının faktöriyelini hesaplayan program
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num,fact=1;
		
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı:");
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			fact *=i;
		}
		
		System.out.println("Faktöriyel:"+fact);
		

	}

}
