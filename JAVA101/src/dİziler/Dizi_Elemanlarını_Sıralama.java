package dİziler;
import java.util.Scanner;
import java.util.Arrays;

public class Dizi_Elemanlarını_Sıralama {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n,eleman;
		
		System.out.print("Dizinin boyutunu giriniz: ");
		n=scan.nextInt();
		
		int [] list=new int[n];
		
		for(int i=0;i<list.length;i++) {
			
			System.out.print(i+1 +".Elemanı:");
			eleman=scan.nextInt();
			list[i]=eleman;
			
		}
		
		Arrays.sort(list);
		System.out.println("Sıralama :"+ Arrays.toString(list) );
		

	}

}
