package java101;
import java.util.Scanner;
public class sayılarıBüyüktenKüçüğeSıralama {

	public static void main(String[] args) {
		
		
		//koşullu ifadeler ile girilen 3 sayıyı büyükten küçüğe sıralama
		
		Scanner input=new Scanner(System.in);
		int a,b,c;
		
		System.out.print("A sayısını giriniz :");
		a=input.nextInt();
		
		System.out.print("B sayısını giriniz :");
        b=input.nextInt();
        
        System.out.print("C sayısını giriniz:");
		c=input.nextInt();
		
		if((a>b)&& (a>c)) {
			
			if(b>c) {
				System.out.println("a>b>c");
			}
			else {
				System.out.println("a>c>b");
			}
		}
		
		
		if((b>a)&&(b>c)) {
			if(a>c) {
				System.out.println("b>a>c");
			}
			else {
				System.out.println("b>c>a");
			}
		}
		
			
		if((c>a)&&(c>b)) {
			if(a>b) {
				System.out.println("c>a>b");
			}
			else {
				System.out.println("c>b>a");
			}
		}
		
		
	}

}
