package java101;
import java.util.Scanner;
public class taksimetreHesabı {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double  yol,acilisÜcreti=10,toplam;
		double yolkm=2.20;
		System.out.println("Gidilen toplam km:");
		yol=input.nextInt();
		
		toplam=acilisÜcreti+(yol*yolkm);
		
		if(toplam<20) {
		   toplam=20;
		}
		
		System.out.println(toplam);

	}

}
