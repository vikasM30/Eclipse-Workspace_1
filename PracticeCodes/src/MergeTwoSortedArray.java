
public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		int a[]= {8,7,9};
		int b[]= {10,5};
		sort(a,b);
		}
		public static void sort(int[] a,int[] b) {
		int[] c= new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
		}
		for (int i = 0, j=a.length; i < b.length; i++,j++) {
		c[j]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
		for (int j = i+1; j < c.length; j++) {
		if(c[i]>c[j]) {
		int temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		}
		}
		}
		System.out.print("Sorted Array : ");
		for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
		}
		}
}
