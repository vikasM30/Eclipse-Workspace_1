import java.util.Arrays;
import java.util.List;

public class RemoveVowelsFromString {
	
	public static String removeVowels(String str) {
		Character vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		int i;
		List<Character> lst = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);
		for(i = 0; i<sb.length();i++) {
			if(lst.contains(sb.charAt(i))) {
				sb.replace(i, i+1, "") ;
                i--;
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		String str = "Either you die a hero or live long enough to see yourself become the"
				+ " villen";
		System.out.println(removeVowels(str));
	}

}
