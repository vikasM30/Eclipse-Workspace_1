
public class ToCheckIdenticalMatrix {
	public int checkEqual(int arr1[][], int arr2[][],int n,int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr1[i][j] == arr2[i][j]) {
					return 1;
				}
				else {
					return 0;
					
				}
				
			}
		}
		return 0;
		
		
	}
	
	public static void main(String[] args) {
		
		ToCheckIdenticalMatrix toCheckIdenticalMatrix = new ToCheckIdenticalMatrix();
		
		int m = 3;
		int n = 2;
		int A[][] = {
				{1,6},
				{1,2},
				{7,7}
				
				};
		int B[][] = {
				{4,6},
				{1,2},
				{7,8}
				};
		if(toCheckIdenticalMatrix.checkEqual(A, B, n, m) == 1) {
			System.out.println("Identical");
		}
		else
			System.out.println("Nope");
		
	}

}
