package java101;
import java.util.Scanner;
public class artıkYılHesaplama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int sene;
		System.out.print("Yıl Giriniz:");
		
		sene=input.nextInt();
		
		if (sene % 4 == 0 && (sene % 100 != 0 || sene % 400 == 0)) {
            System.out.println(sene + " bir artık yıldır.");
        } else {
            System.out.println(sene + " bir artık yıl değildir.");
        }

	}

}
