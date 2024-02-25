package java101;
import java.util.Scanner;
public class notOrtalamaHesaplaması {

	public static void main(String[] args) {
		
		int mat,turkce,fizik,geo;
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("Türkçe  notunuzu giriniz:");
		turkce = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz:");
		fizik = input.nextInt();
		
		System.out.print("Matematik notunuzu giriniz:");
		mat = input.nextInt();
		
		System.out.print("Geometri notunuzu giriniz:");
		geo= input.nextInt();
		
		float ort;
		
		ort=(mat+fizik+turkce+geo)/4;
		System.out.println("Ortalama:"+ort);
		
		String  sonuc=ort>60?"sınavı geçti":"sınavdan kaldı";
		
		System.out.println(sonuc);
		

	}

}
