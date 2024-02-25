package java101;
import java.util.Scanner;
public class burçBulanProgram {

	public static void main(String[] args) {
		
	int month,day;
	Scanner input=new Scanner (System.in);
		
	System.out.print("Doğduğunuz ay :");	
	month=input.nextInt();
	
	
	System.out.print("Doğduğunuz gün:");
	day=input.nextInt();
	
	switch (month) {
	
	case 1:
		if(day<=21) {
			System.out.println("Burcunuz: Oğlak");
		}
		else {
			System.out.println("Burcunuz : Kova");
		}
	    break;
	
	case 2:
		if(day<=19) {
			System.out.println("Burcunuz: Kova");
		}
		else {
			System.out.println("Burcunuz: Balık");
		}
	    break;
	case 3:
		if(day<=20) {
			System.out.println("Burcunuz: Balık");
		}
		else {
			System.out.println("Burcunuz : Koç");
		}
	    
	    break;
	    
	case 4: // nisan
		if(day<=20) {
			System.out.println("Burcunuz: Koç");
		}
		else {
			System.out.println("Burcunuz: Boğa");
		}
	    break;
	    
	case 5: // mayıs
		if(day<=21) {
			System.out.println("Burcunuz: Boğa");
		}
		else {
			System.out.println("Burcunuz: İkizler");
		}
	    break;
	      
	case 6: // haziran
		if(day<=22) {
			System.out.println("Burcunuz: İkizler");
		}
		else {
			System.out.println("Burcunuz: Yengeç");
		}
	    break;
	
	    
	case 7: // temmuz
		if(day<=22) {
			System.out.println("Burcunuz: Yengeç");
		}
		else {
			System.out.println("Burcunuz: Aslan");
		}
	    break;
	    
	    
	case 8: // ağustos
		if(day<=22) {
			System.out.println("Burcunuz: Aslan");
		}
		else {
			System.out.println("Burcunuz: Başak");
		}
	    break;
	    
	    
	    
	case 9: //eylül
		if(day<=22) {
			System.out.println("Burcunuz: Başak");
		}
		else {
			System.out.println("Burcunuz: Terazi");
		}
	    break;
	    
	case 10: // ekim
		if(day<=22) {
			System.out.println("Burcunuz: Terazi");
		}
		else {
			System.out.println("Burcunuz: Akrep");
		}
	    break;
	    
	    
	case 11: // kasim
		if(day<=21) {
			System.out.println("Burcunuz: Akrep");
		}
		else {
			System.out.println("Burcunuz: Yay");
		}
	    break;
	    
	    
	    
	case 12: // aralık
		if(day<=21) {
			System.out.println("Burcunuz: Yay");
		}
		else {
			System.out.println("Burcunuz:Oğlak");
		}
	    break;
	    
	    
	 default:
		 System.out.println("Eksik veya Hatalı Giriş");
	    
	    
	    
	    
	}
	
		
		

	}

}
