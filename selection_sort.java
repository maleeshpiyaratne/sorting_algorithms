import java.util.Arrays;

public class selection_sort {

	public static void selectionSort(int [] arr) {
		int n = arr.length;
		
		// less than insead of less than or equals to 
		// and n - 1 to stop before the last index
		for(int i = 0; i < n - 1; i++){
			
			// Varible to hold the position of the minimum element/value
			int min_idx = i;
			
			// Iterate through the unsorted portion to find the actual minimum
			for(int j = i+1; j < n; j++) {
				
				// Update min_idx if small element is found
				if(arr[j] < arr[min_idx]){
					min_idx = j;
					
				}
			}
				
			// Move lowest value to it's correct index position
			int temp = arr[i]; // temp hold value already in position
			arr[i] = arr[min_idx]; // set min value to correct position
			arr[min_idx] = temp; // set swapped out value to min_idx position
			
		}
		
	}

	public static void printArray(int arr []) {
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
	
		int [] arr = {64,25,12,22,11};
		
		System.out.print("Original Array: ");	
		printArray(arr);
		
		selectionSort(arr);
		
		System.out.print("Sorted Array: ");
		printArray(arr);
		
	}

} 