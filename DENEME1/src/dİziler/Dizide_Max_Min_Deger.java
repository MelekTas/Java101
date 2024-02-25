package dİziler;
import java.util.Scanner;
public class Dizide_Max_Min_Deger {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int []list=new int[5];
        for(int i=0;i<list.length;i++) {
			
			System.out.print("Dizi elemanı giriniz:");
			list[i]=scan.nextInt();

        }
		
        int maxValue=list[0];
        int minValue=list[0];
        
        for(int i=0;i<list.length;i++) {
        	
        	if(list[i]<minValue) {
        		minValue=list[i];
        		
        	}
        	
        }
        
        for(int i=0;i<list.length;i++) {
        	
        	if(list[i]>maxValue) {
        		maxValue=list[i];
        		
        	}
        	
        }
        
        System.out.println("Dizinin en küçük elemanı: "+minValue);
        System.out.println("Dizinin en büyük elemanı: "+maxValue);
	}

}
