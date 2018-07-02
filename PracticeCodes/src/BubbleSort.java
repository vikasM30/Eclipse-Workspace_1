
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {10,7,1,5,9,3,4,5,6,1,12,19,77,22,5};
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
