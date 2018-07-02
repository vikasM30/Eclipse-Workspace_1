
public class FactorialUsingForLoop {
	public static void main(String[] args) {
		int i, n = 6;
		int res = 1;
		if(n<=0) {
			System.out.println(1);
		}
		else
			for(i = 1; i <= n; i++) {
				res = res * i;				
			}
		System.out.println(res);
			
		
	}

}
