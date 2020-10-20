package bucketsort;

import java.util.Collections;
import java.util.Vector;

public class Sort {
	public static void bucketsort (float[] arr, int n) {
		if(n<=0)
			return;
		Vector<Float>[] buckets=new Vector[n];
		//create n number of buckets 
		for(int i=0;i<n;i++) {
			buckets[i]=new Vector<Float>();
		}
		//add values to buckets respective to index 
		for(int i=0;i<n;i++) {
			float idx= arr[i]*n;
			buckets[(int)idx].add(arr[i]);
		}
		//sort each values in buckets[i]
		for(int i=0;i<n;i++) {
			Collections.sort(buckets[i]);
		}
		//add the sorted bucket values in the array 
		int index=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<buckets[i].size();j++) {
				arr[index++]=buckets[i].get(j);
			}
		}
	}
	public static void main(String[] args) {
		float arr[]= {};
		int n=arr.length;
		bucketsort(arr,n);
		for(float a1:arr) {
			System.out.println(a1+" ");
		}
	}

}
