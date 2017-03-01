
public class TriSelect {
	
	public static void swap(int[] data, int i, int j){
		int tmp= data[i];
		data[i]= data[j];
		data[j]= tmp;
		}
	
	public static int minimumIndex(int[] data, int begin, int end){
		int res= begin;
		for(int i=begin+1; i != end; ++i){
			if(data[i] < data[res]){
				res= i;
			}
		}
		return res;
	}

		public static void sort(int[] data){
			int a = (int) System.currentTimeMillis();
			if(data.length < 2){return;}
				for(int i=0; i != data.length-1; ++i){
					swap(data, i, minimumIndex(data, i, data.length));
				}
			int b = (int) System.currentTimeMillis();
			int c = b-a;
			System.out.println("Durée : " + c);
		}
}
