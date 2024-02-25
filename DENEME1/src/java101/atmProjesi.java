package java101;
import java.util.Scanner;
public class atmProjesi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String userName;
		String password; //kullanıcı int şifre girmek zorunda değil.string veri tipi seçtik
		int right=3;
		int select;
		int balance=1500;
		int price; //işlem yapılacak ücret
		
		while(right>0) {
			
			System.out.print("Kullanıcı Adınız:");
			userName=scan.nextLine();
			System.out.print("Şifreniz:");
			password=scan.nextLine();
			
			if(userName.equals("patika")&& password.equals("dev123")) {
				
				System.out.println("**Kodluyoruz Bankasına Hoşgeldiniz**");
				do {
                     System.out.println("1->PARA ÇEKME\n"+
				                        "2->PARA YATIRMA\n"+
                    		            "3->BAKİYE SORGULAMA\n"+
				                        "4->ÇIKIŞ YAP ");					
					System.out.print("İşleminizi seçiniz:");
					select=scan.nextInt();
					
					if(select==1) {
						System.out.print("Çekeceğiniz Miktar:");
						price=scan.nextInt();
						if(price>balance) {
							System.out.println("Yetersiz Bakiye !!");
						}
						else {
							balance-=price;
						}
						
						}
					else if(select==2) {
						System.out.print("Yatıracağınız Miktar:");
						price=scan.nextInt();
						balance+=price;
						
						
					}
					else if(select==3) {
						
						System.out.println("Bakiyeniz:"+balance);
						
					}
	
					
				}
				while(select!=4) ;
					
					System.out.println("Tekrar Görüşmek üzere!!");
					break;
				
			}
			else{
				
				right--;
				System.out.print("Kullanıcı adı veya şifre hatalıdır. Tekrar deneyiniz!\n");
				if(right==0) {
					System.out.println("Hesabınız Bloke olmuştur.Bankanızla iletişime geçiniz.");
				}
				else {
					System.out.print("Kalan hakkınız:"+right+"\n");
					
				}
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
