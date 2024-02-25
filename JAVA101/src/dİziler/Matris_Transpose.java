package dİziler;
import java.util.Scanner;


public class Matris_Transpose {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] matris = {
                {5, 8, 6},
                {4, 2, 1},
                {9, 0, 7}
        };

		int [][] transpose=new int [matris[0].length][matris.length];
		
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[i].length;j++) {
				transpose[j][i]=matris[i][j];
				
			}
		}

		 for (int[] u : transpose) {
	            for (int x : u) {
	                System.out.print(x + " ");
	            }
	            System.out.println();
	        }
		
		
	}

}
