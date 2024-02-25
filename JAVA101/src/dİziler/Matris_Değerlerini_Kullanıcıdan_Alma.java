package dİziler;
import java.util.Scanner;
public class Matris_Değerlerini_Kullanıcıdan_Alma {
	//Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız
	
	public static void main(String[] args) {
		
		int [][] array =new int[2][2];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter " 
		        +array.length
				+ " rows and "
				+ array[0].length 
				+ " columns: ");
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				
				
				array[i][j]=input.nextInt();;
				
			}
			
		}
		

	}

}
