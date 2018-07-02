// fctoriall with rescursion

public class Factorial {
	
	public int facto(int num) {
		int res = 1;
		
		if (num >= 1) {
			res = num * facto(num-1);
			return res;
		}
		return 1;
		
	}
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		System.out.println(factorial.facto(12));
		
	}

}
