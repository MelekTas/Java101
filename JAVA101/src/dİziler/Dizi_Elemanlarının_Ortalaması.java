package dİziler;
import java.util.Arrays;
import java.util.Scanner;

public class Dizi_Elemanlarının_Ortalaması {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int []list= new int [5];
		double  sum=0;
		double avarage=0;
		
		for(int i=0;i<list.length;i++) {
			
			System.out.print("Dizi elemanı giriniz:");
			list[i]=input.nextInt();
			sum+=list[i];
		}
		avarage=sum/list.length;
		System.out.println("Dizinin ortalaması: "+avarage);
		
		
		
	}

}
