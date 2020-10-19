package countingsort;

import java.util.Arrays;

public class Sort {
	static int[] count_sort(int[] arr) {
		int n=arr.length;
		int[] output=new int[n];
		int count[]=new int[9];
		for(int i=0;i<9;++i) {
			count[i]=0;
		}
		for(int i=0;i<n;++i)
			++count[arr[i]];
		
		for (int i=1;i<=8;++i)
			count[i]+= count[i-1];
		
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]]-1]=arr[i];
			--count[arr[i]];
		}
		return output;
	}
	public static void main(String[] args) {
		int[] arr= {7,4,3,2,1,5,1};
		int n=arr.length;
		System.out.println("before sort");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		int[] new_arr=count_sort(arr);
		System.out.println("after merge");
		for(int i=0;i<n;i++)
			System.out.print(new_arr[i]+" ");
	}

}
