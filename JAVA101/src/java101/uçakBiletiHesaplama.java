package java101;
import java.util.Scanner;
public class uçakBiletiHesaplama {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	int mesafe,yas,yolculukTipi;
	double fiyat,odenecekTutar;
	System.out.print("Mesafeyi km türünden giriniz: ");
	mesafe=input.nextInt();
	
	System.out.print("Yaşınızı giriniz:");
	yas=input.nextInt();
	
	
	System.out.println("1 => Tek Yön\n2 => Gidiş-Dönüş");	
    System.out.print("Yolculuk Tipini Seçiniz:");
    yolculukTipi=input.nextInt();
    
    if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
        System.out.println("Hatalı Veri Girdiniz !");
        return;
    }

    fiyat=mesafe*0.10;
    
    if (yas < 12) {
        fiyat *= 0.5; // %50 indirim
    } else if (yas >= 12 && yas <= 24) {
        fiyat*= 0.9; // %10 indirim
    } else if (yas > 65) {
        fiyat *= 0.7; // %30 indirim
    }

    // Yolculuk tipine göre indirim uygula
    if (yolculukTipi == 2) {
        fiyat *= 0.8; // Gidiş-dönüş biletine %20 indirim
    }

    // Sonuçları ekrana yazdır
    System.out.println("Toplam Bilet Fiyatı: " + 2*fiyat + " TL");
}
    
    


	}

