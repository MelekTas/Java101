package java101;
import java.util.Scanner;
public class ebobHesaplama {

	public static void main(String[] args) {
		int n1,n2;
		Scanner scan=new Scanner(System.in);
		
		// EBOB HESAPLAMA 1. YÖNTEM
		
		System.out.print("n1 sayısını giriniz:");
		n1=scan.nextInt();
		System.out.print("n2 sayısını giriniz:");
		n2=scan.nextInt();
		int ebob1=1;
		for(int i=1;i<=n1;i++) {
			
			if(n1%i==0 && n2%i==0) {
			
				System.out.println(i);
				ebob1=i;
			
			}
			
		}
		
		System.out.println("Ebob:"+ebob1);
		
		//EBOB HESAPLAMA 2.YÖNTEM
		// bu yöntem daha az tekrarla sonuca ulaştırdığı için daha az maliyetli
		System.out.print("n1 sayısını giriniz:");
		n1=scan.nextInt();
		System.out.print("n2 sayısını giriniz:");
		n2=scan.nextInt();
		int ebob2=1;
		for(int k=n1;k>=1;k--) {
			
			if(n1%k==0 && n2%k==0) {
				
				System.out.println(k);
				ebob2=k;
			    break;
			}
			
		}
		
		System.out.println("Ebob:"+ebob2);
		
	}

}
