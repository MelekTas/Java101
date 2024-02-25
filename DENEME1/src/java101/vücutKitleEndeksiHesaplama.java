package java101;
import java.util.Scanner;
public class vücutKitleEndeksiHesaplama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double kilo,boy,ındeks;
		
		System.out.print("Kilonuzu Giriniz:");
		kilo=input.nextDouble();
		
		System.out.print("Boyunuzu giriniz: ");
	    boy=input.nextDouble();
	    
	    ındeks= kilo /(boy*boy);
	    System.out.println("İndeks Değeriniz= "+ındeks);
		
		
		
	}

}
