
public class bubble_sort {

	public static void bubbleSort(int arr []){
		int i,j,temp;
		boolean swapped;
		
		for(i=0; i < arr.length - 1; i++){
			swapped = false;
			
			for(j=0; j< arr.length - i -1; j++){
				
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				
			}
			
			if(swapped == false)
				break;
			
		}
		
	}	

	public static void printArray(int arr []){
		for (int val : arr){
			System.out.print(val+" ");
		}
		System.out.println("");
	}

	public static void main (String [] args) {

		int arr [] = {64, 34, 25, 12, 22, 11, 90};

		System.out.print("Original Array: ");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.print("Sorted Array: ");
		printArray(arr);

	}

}