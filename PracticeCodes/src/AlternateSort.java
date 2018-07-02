import java.util.Arrays;

public class AlternateSort {
	public static void main(String[] args) {
		int arr[] = {8,5,4,1,3,6,9,2,7};
		Arrays.sort(arr);
		/*
		for(int i=0;i<(arr.length-1)/2;i++) {
			System.out.print(arr[i] + " ");
			for(int j=arr.length-1; j>(arr.length-1)/2;j--) {
				System.out.print(arr[j]+ " ");
				
			}
		}
		*/
		int i=0;
		int j = arr.length-1;
		while (i < j) {
			System.out.print(arr[j] + " ");
			j--;
			System.out.print(arr[i] + " ");
			i++;
			
		}
		if(arr.length % 2 !=0) {
			System.out.print(arr[i]);
		}
	}

}
