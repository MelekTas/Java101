package dİziler;

public class Çok_Boyutlu_Diziler {

	public static void main(String[] args) {
		
		int [][] matris=new int[3][4];
		int number=1;
		
		for(int i=0;i<matris.length;i++) {
			
			for(int j=0;j<matris[i].length;j++) {
				
				matris[i][j]=number++;
				
			}
			
		}
		
         for(int i=0;i<matris.length;i++) {
			
			 for(int j=0;j<matris[i].length;j++) {
				
				System.out.print(matris[i][j]+" ");
				}
			 System.out.println();
		}
      
         // çoklu dizilerin bir diğer gösterimi
         int [][]array= {
        		 
        		 {0,1,2},
        		 {5,6,7},
        		 
         };
         
         System.out.println(array [1][1]);
         
	}

}
