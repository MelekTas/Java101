package java101;
import java.util.Scanner;
public class dikÜçgeninHipotenüsHesabı {

	public static void main(String[] args) {
		int a,b;
		double c;
		
		Scanner input=new Scanner(System.in);
		System.out.print("A kenarı için değer giriniz: ");
		a=input.nextInt();
		
		System.out.print("B kenarını giriniz:");
		b=input.nextInt();
		
		// Math.sqrt() ifadesi bir ifadenin karekök hesaplamasında kullanılıyor.
		
		c=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs ="+c);

	}

}
