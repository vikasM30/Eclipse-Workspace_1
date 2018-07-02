
public class GCDofArray {
	
	public static int gcd(int a, int b) 
	{
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
	public static int getGCD(int arr[], int n)
	{
		int result = arr[0];
		for(int i =0; i<n;i++) {
			
			result = gcd(arr[i],result);
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {8,9};
		int n = arr.length;
		System.out.println(getGCD(arr,n));
	}
	

}
