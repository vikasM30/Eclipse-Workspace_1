
public class LCMofTwoNos {
	public  int lcm(int a, int b) {
		int lcm;
		if(a>b) {
			lcm = a;
		}
		else {
			lcm = b;
		}
		while(true) {
		if(lcm % a== 0 && lcm % b ==0){
			return lcm;
			
			
		}
		lcm++;
		}
		
		
	}
	public static void main(String[] args) {
		LCMofTwoNos LCM = new LCMofTwoNos();
		System.out.println(LCM.lcm(10, 7));
		
	}

}
