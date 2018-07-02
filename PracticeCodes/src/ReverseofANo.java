
public class ReverseofANo {
	public long reverse(long num) {
		long sum = 0;
		long rem;
		long temp = num;
		while(num != 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num /10;
					
		}
		return sum;
	}
	public static void main(String[] args) {
		ReverseofANo reverseofANo = new ReverseofANo();
		System.out.println(reverseofANo.reverse(784));
		
		
	}

}
