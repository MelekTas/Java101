package boksMaçı;

public class Fighter {

	String name;
	int damage;
	int health;
    int weight;
    
    

   Fighter(String name,int damage,int health,int weight){
	   this.name=name;
	   this.health=health;
	   this.damage=damage;
	   this.weight=weight;
	   
   }

   int  hit (Fighter foe) {
	   
	   System.out.println(this.name+"=>"+foe.name+" "+this.damage+" yumruk vurdu.");
	   if(foe.health-this.damage<0) {
		   return 0;
	   }
	   
	   else {
		   return foe.health-this.damage;
	   }
	   
	   
   }


}

