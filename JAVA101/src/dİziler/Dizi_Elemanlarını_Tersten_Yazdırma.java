package dİziler;

public class Dizi_Elemanlarını_Tersten_Yazdırma {
	
	
	public static int[] reverse(int[] list) 
	{
	   int[] result = new int[list.length];

	   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) 
	   {
	      result[j] = list[i];
	   }
	   
	   return result;
	}
	
	public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) 
		   {
		      System.out.print(array[i] + " ");
		   }
		}
	
	public static void main(String[] args) {
		
		int [] dizi = {10,20,30,40,50,60,70,80,90,100};
		int [] newListe=reverse (dizi);
		printArray(newListe);
		
		

	}

}
