package mergesort;

public class Sort {
	static void merge(int[] array, int left, int middle,int right) {
		int n1=middle-left+1;
		int n2=right-middle;
		int[] Left=new int[n1];
		int[] Right=new int[n2];
		
		for(int i=0;i<n1;++i)
			Left[i]=array[left+i];
		for(int j=0;j<n2;++j)
			Right[j]=array[middle+1+j];
		
		int i=0,j=0;
		int k=left;
		
		while(i<n1 && j<n2) {
			if(Left[i] <= Right[j]) {
				array[k]=Left[i];
				i++;
			}
			else {
				array[k]=Right[j];
				j++;
			}
			k++;
		}
		//copy rest of elements
		while(i<n1) {
			array[k]=Left[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k]=Right[j];
			j++;
			k++;
		}
	}

	static void merge_sort(int[] array,int left, int right) {
		if(left<right) {
		int middle=(left+right)/2;
		merge_sort(array, left, middle);
		merge_sort(array, middle+1, right);
		merge(array, left, middle, right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {13,26,9,8,3,2,11,5};
		int n=arr.length;
		System.out.println("before merge");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		merge_sort(arr,0,n-1);
		System.out.println("after merge");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
