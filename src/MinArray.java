public class MinArray {
	
	public static int minArray(int[] tableau){
		int a = (int) System.currentTimeMillis();
		int m = tableau[0];
		for (int i=0; i<tableau.length-1;i++){
			if (m>tableau[i+1]){
				m=tableau[i+1];
			}
		}

		System.out.println("Valeur minimum du tableau : " + m);
		int b = (int) System.currentTimeMillis();
		int c = b-a;
		System.out.println("Durée : " + c);
		return m;
		

	}
	
}
