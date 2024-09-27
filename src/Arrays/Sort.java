package Arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int arr[] = {90,4,100,5,1,2,3,89,0};
		
			
		// after using Assays.sort() , the elements will be sorted in ascending order.
		Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
