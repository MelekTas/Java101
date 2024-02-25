package java101;
import java.util.Scanner;
public class manavKasaProgramı {

	public static void main(String[] args) {
		
//Java ile kullanıcıların manavdan almış oldukları ürünlerin 
//kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
	Scanner input=new Scanner(System.in);
	double armut,elma,domates,muz,patlıcan;
	double tutar;
	double akilo=2.4,ekilo=3.67,dkilo=1.11,mkilo=0.95,pkilo=5.00;
	
	System.out.print("Armut kaç kilo? :");
	armut=input.nextDouble();
		
	System.out.print("Elma kaç kilo? :");
	elma=input.nextDouble();
	
	System.out.print("Domates kaç kilo? :");
	domates=input.nextDouble();
	
	System.out.print("Muz kaç kilo? :");
	muz=input.nextDouble();
	
	System.out.print("Patlıcan  kaç kilo? :");
	patlıcan=input.nextDouble();
	
	
	
	tutar=(akilo*armut)+(ekilo*elma)+(dkilo*domates)+(mkilo*muz)+(pkilo*patlıcan);
	
	System.out.println("Toplam Tutar :"+tutar+" TL");
	
	
	
	}

}
