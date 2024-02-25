package java101;
import java.util.Scanner;
public class Fıbonaccı {
	//Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("Basamak sayısı:");
		num=scan.nextInt();
		
		int a=1,b=1;
		int c;
		System.out.print(a+","+b+",");
		
		for(int i=1;i<=num-2;i++) {
			c=a+b;
		    System.out.print(+c+",");
			a=b;
			b=c;
			
			
			
		}
		
		
		
		
		

	}

}
