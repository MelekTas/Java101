package java101;
import java.util.Scanner;
public class mükemmelSayiBulma {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int number=input.nextInt();
		int sum=0;
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
				sum+=i;
				
			}
		}
		if(sum==number) {
			System.out.println(number+" Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}
		
		
		
		
		
	}

}
