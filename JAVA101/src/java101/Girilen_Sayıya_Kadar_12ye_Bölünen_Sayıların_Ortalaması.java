package java101;
import java.util.Scanner;
public class Girilen_Sayıya_Kadar_12ye_Bölünen_Sayıların_Ortalaması {
	//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
	
	
	
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num,sum=0,sayac=0;
	double avarage=0;
	System.out.print("Lütfen bir sayı giriniz: ");
	num=input.nextInt();
	
	//Ayrıca, bu programda 0'dan başlamak yerine 1'den başlamak daha mantıklıdır,
	//çünkü 0 her sayıya tam bölünür ve bu programın amacına uygun değildir.
	
	for(int i=1;i<num;i++) { 
		
		if(i%3==0 && i%4==0) {
			
			sum +=i;
			sayac++;
			
		}
		
		
	}
		avarage=sum/sayac;
		System.out.println("Ortalama :"+avarage);
		
		
		
		

	}

}
