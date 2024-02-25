package boksMaçı;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int maxWeight;
	int minWeight;

	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.maxWeight=maxWeight;
		this.minWeight=minWeight;
		
		
	}
	
	void  run() {
		
		if(ischeck()) {
			while(this.f1.health>0 && this.f2.health>0) {
				System.out.println("                   ");
				System.out.println("====YENİ ROUND====");
				this.f2.health=this.f1.hit(f2);
				if(isWin()) {
					break;
				}
				this.f1.health=this.f2.hit(f1);
				if(isWin()) {
					break;
				}
				printScore();
			}
		}
		else {
			System.out.println("Dövüşçülerin sikletleri uygun değil!");
		}
		
		
	}
	
	boolean ischeck() {
		
		return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&& (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
	}
   
	
	boolean isWin() {
	   
	   if(this.f1.health==0) { 
		   System.out.println(this.f2.name+" Kazandı.");
		   return true;
	   }
	   if(this.f2.health==0) {
		   System.out.println(this.f1.name+" Kazandı.");
		   return true;
	   }
	   return false;
   }
	
	  public void printScore() {
	        System.out.println("------------");
	        System.out.println(f1.name + " Kalan Can :" + f1.health);
	        System.out.println(f2.name + " Kalan Can :" + f2.health);
	    }
}
