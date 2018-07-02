public class GCDofTwoNos {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int i, gcd = 0;
		for(i = 1; i<=a && i<=b; ++i) {
			if(a % i ==0 && b % i == 0) {
				gcd = i;
			}
			
		}
		System.out.println(gcd);
	}

}
