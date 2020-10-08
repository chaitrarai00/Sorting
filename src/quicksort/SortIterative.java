package quicksort;

public class SortIterative {

	static int partition(int[] array,int low,int high) {
		int pivot=array[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++) {
			if(array[j]<=pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return i+1;
	}
	
	static void qsortiterative(int[] array,int low, int high) {
		int[] array_index=new int[high-low+1];
		
		int pointer=-1;
		
		array_index[++pointer]=low;
		array_index[++pointer]=high;
		
		while(pointer>=0) {
			high=array_index[pointer--];
			low=array_index[pointer--];
			
			int p=partition(array, low, high);
			
			if(p-1>low)
			{
				array_index[++pointer]=low;
				array_index[++pointer]=p-1;
			}
			if(p+1<high)
			{
				array_index[++pointer]=p+1;
				array_index[++pointer]=high;
			}
		}
	}

	public static void main(String[] args) {
		int n=5;
		int[] array= {3,2,6,9,2};
		qsortiterative(array, 0, n-1);
		for(int i=0;i<n;i++)
			System.out.print(array[i]+" ");

	}

}
