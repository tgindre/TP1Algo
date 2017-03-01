
public class BubbleSort {
	public static void sort(int[] data){
		int a = (int) System.currentTimeMillis();
		if(data.length < 2)
		{
			return;
		}
		boolean hadToSwap= false;
		do{
			hadToSwap=false;
			for(int i= 0; i != data.length-1; ++i){
				if(data[i] > data[i+1]){
					TriSelect.swap(data, i, i+1);
					hadToSwap= true;
				} 
			}
		}while(hadToSwap);
		
		int b = (int) System.currentTimeMillis();
		int c = b-a;
		System.out.println("Durée : " + c);
	}
}
