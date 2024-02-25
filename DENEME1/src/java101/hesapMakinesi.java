package java101;
import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int n1,n2,select,sonuc=0;
		
		System.out.print("İlk sayıyı giriniz:");
		n1=input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz:");
		n2=input.nextInt();
		
		System.out.println("1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme");
		System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
		select=input.nextInt();
		
		switch(select) {
		
		case 1:
			sonuc=n1+n2;
			break;
		case 2:
			sonuc=n1-n2;
			break;
		case 3: 
			sonuc=n1*n2;
			break;
		case 4:
			sonuc=n1/n2;
			break;
		default:
			System.out.println("Eksik veya Hatalı tuşlama!");
		
		
		}
		
		System.out.println("Sonuç= "+sonuc);
		
		
	}

}
