package dİziler;

public class forEach {

	public static void main(String[] args) {
		
		//ForEach genel kullanımı
		/*	for (veritipi degisken: diziAdi) {
			  // kod bloğu
			}
                   */
		
		int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
		
		
		
	}

}
