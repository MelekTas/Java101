package java101;
import java.util.Scanner;
public class havaSıcaklığınaGöreEtkinlikÖnerme {

	
	
	
	//Koşullar :

		//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		//Sıcaklık 25'ten buyuk  ise "Yüzme" etkınlığımı öner. 
		
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
	    int heat;
		
		System.out.println("Hava Sıcaklığını Giriniz: ");
		heat=input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
	   } 
		else if ((heat>=5)&& (heat<25)) {
			
			if(heat<=15) {
				System.out.println("Sinemaya Gidebillirsiniz!");
			}
			if(heat>=10) {
				System.out.println("Pikniğe gidebilirsiniz.");
			}
			
			
			
		}
		else {
				System.out.println("Yüzmeye gidebilirisniz");
			}
		
		
		
				
			
			
			
			
		}
				

	}

