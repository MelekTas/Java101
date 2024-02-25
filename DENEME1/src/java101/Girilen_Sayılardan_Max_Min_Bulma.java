package java101;
import java.util.Scanner;
public class Girilen_Sayılardan_Max_Min_Bulma {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz? ");
	    int n = scan.nextInt();

	        if (n <= 0) {
	            System.out.println("Geçersiz giriş!");
	            return;
	        }

	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int i = 0; i < n; i++) {
	            System.out.print((i + 1) + ". sayıyı girin: ");
	            int num = scan.nextInt();

	            if (num > max) {
	                max = num;
	            }

	            if (num < min) {
	                min = num;
	            }
	        }

	        System.out.println("En büyük sayı: " + max);
	        System.out.println("En küçük sayı: " + min);

	       
	        // max değişkenini en küçük olası değer olan Integer.MIN_VALUE ile başlatırız. 
	        //Bu, daha sonra girilen herhangi bir sayı, bu değerden daha büyükse, max değerini güncellememizi sağlar.
		
	        //min değişkenini en büyük olası değer olan Integer.MAX_VALUE ile başlatırız.
	        //Bu, daha sonra girilen herhangi bir sayı, bu değerden daha küçükse, min değerini güncellememizi sağlar.

}
}
