package java101;
import java.util.Scanner;
public class üsAlmaİşlemi {
	//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);	
		
	int num1,num2,result=1;
	
	System.out.print("Üssü alınacak sayı:");	
	num1=scan.nextInt();
	
	System.out.print("Üs olacak sayı:");
	num2=scan.nextInt();
	
	for(int i=1;i<=num2;i++) {
		
		result *=num1;
		
	}
		System.out.println("Sonuç :"+result);
		
		

	}
	

}
