
public class NoofDigits {
	public static int answer(long n) {
		int count = 0;
		while(n>0) {
			n = n / 10;
			count ++;
			
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(answer(1234567257));
		
	}

}
