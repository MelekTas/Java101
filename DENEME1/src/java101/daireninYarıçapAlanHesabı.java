package java101;
import java.util.Scanner;
public class daireninYarıçapAlanHesabı {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		double yaricap,pi=3.14,alan,cevre;
		
		System.out.print("Dairenin yarıçap değerini giriniz: ");
		yaricap=input.nextDouble();
		
		alan=pi*(yaricap*yaricap);
		cevre=2*pi*yaricap;
		System.out.println("Alan: "+alan );
		System.out.println("Çevre:"+cevre);
		
	}

}
