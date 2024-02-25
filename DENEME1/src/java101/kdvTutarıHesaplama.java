package java101;
import java.util.Scanner;
public class kdvTutarıHesaplama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double tutar,kdvOran=0.18,kdvlitutar,kdvTutar;
		
		// kullanıcıdan veri aldığımızda önce veri alıcağımızı kullanıcıya bilditip sonra alınacak veri için input yazıyoruz
		
		System.out.println("Tutar: ");
        tutar=input.nextDouble();
        
        
		kdvTutar=tutar*kdvOran;
		kdvlitutar=tutar+kdvTutar;
		
		System.out.println("KDV li tutar: "+kdvlitutar);
		System.out.println("KDV siz tutar: "+kdvTutar);
		
		
		
		
		

	}

}
