package java101;
import java.util.Scanner;
public class kullanıcıGirişKontrolü {

	public static void main(String[] args) {
		
		Scanner p=new Scanner(System.in);
		String userName,password;
		
		System.out.print("Kullanıcı adı: ");
		userName=p.nextLine();
		
		System.out.print("Şifre:");
		password=p.nextLine();
		
		if(userName.equals("Melek")&& password.equals("1234")) {
			
			System.out.println("Giriş Başarılı");
		}
		else {
			
			System.out.println("Giriş Başarısız");
		}

	}

}
