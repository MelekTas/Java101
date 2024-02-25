package java101;
import java.util.Scanner;

public class çinZodyağıDeğeriHesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int yıl;
		
		System.out.print("Lütfen doğum yılınızı giriniz: ");
		yıl=input.nextInt();
		
		if(yıl %12==0) {
			System.out.println("Çin Zodyağı Burcunuz:Maymun");
		}

		else if(yıl %12==1) {
			System.out.println("Çin Zodyağı Burcunuz:Horoz");
		}
		else if(yıl %12==2) {
			System.out.println("Çin Zodyağı Burcunuz:Köpek");
		}
		else if(yıl %12==3) {
			System.out.println("Çin Zodyağı Burcunuz:Domuz");
		}
		
		else if(yıl %12==4) {
			System.out.println("Çin Zodyağı Burcunuz:Fare");
		}
		
		else if(yıl %12==5) {
			System.out.println("Çin Zodyağı Burcunuz:Öküz");
		}
		else if(yıl %12==6) {
			System.out.println("Çin Zodyağı Burcunuz:Kaplan");
		}
		
		else if(yıl %12==7) {
			System.out.println("Çin Zodyağı Burcunuz:Tavşan");
		}
		else if(yıl %12==8) {
			System.out.println("Çin Zodyağı Burcunuz:Ejderha");
		}
		else if(yıl %12==9) {
			System.out.println("Çin Zodyağı Burcunuz:Yılan");
		}
		else if(yıl %12==10) {
			System.out.println("Çin Zodyağı Burcunuz:At");
		}
		else if (yıl %12==11) {
			System.out.println("Çin Zodyağı Burcunuz:Koyun");
		}
		
		else {
			System.out.println("Eksik veya Hatalı Giriş!");
		}
		

	}

}
