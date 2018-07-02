
public class AlternateSortMethodTwo {
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
	int m=0;
	int n = arr.length-1;
	while (m < n) {
		System.out.print(arr[n] + " ");
		n--;
		System.out.print(arr[m] + " ");
		m++;
		
	}
	if(arr.length % 2 !=0) {
		System.out.print(arr[m]);
	}
	}
}
