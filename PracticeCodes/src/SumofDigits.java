
public class SumofDigits {
	public int sum(int n) {
		
		int total = 0;
		int rem;
		while(n>0) {
			rem = n % 10;
			total += rem;
			n = n / 10;
			
		}
		return total;
		
	}
	
	public static void main(String[] args) {
		SumofDigits sumofDigits = new SumofDigits();
		System.out.println(sumofDigits.sum(8973));
	}

}
