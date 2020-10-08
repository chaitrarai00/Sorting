package insertionsort;

public class Sort {
	
	static void insertion_sort(int[] array) {
		int n=array.length;
		for(int i=1;i<n;i++) {
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
			}
	}
	
	

	public static void main(String[] args) {
		int[] array= {3,2,6,9,2};
		insertion_sort(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	
}
}
