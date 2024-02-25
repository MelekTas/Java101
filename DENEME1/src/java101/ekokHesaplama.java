package java101;
import java.util.Scanner;
public class ekokHesaplama {

	public static void main(String[] args) {
	// s1 = en küçük olucak şekilde hesaplama yapıyoruz
		int s1, s2;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("s1 giriniz:");
		s1=scan.nextInt();
		System.out.print("s2 giriniz:");
		s2=scan.nextInt();
		
		for(int i=1;i<=(s1*s2);i++) {
			
			if(i%s1==0 && i%s2==0) {
				
				System.out.println(i);
				break;
			}
			
			
			
		}
		
	}

}
