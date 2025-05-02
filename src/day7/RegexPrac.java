package day7;
import java.util.regex.*;
import java.util.*;

public class RegexPrac {

	public static void main(String[] args) {
		
//		Match all words starting with "a".
//		➤ Input: "apple banana apricot"
//			➤ Expected: "apple", "apricot"
		String[] input = {"apple", "banana", "apricot", "Ananth"};
		for(int i=0;i<input.length;i++) {
			Pattern pattern = Pattern.compile("^[aA]");
			Matcher matcher = pattern.matcher(input[i]);
			if(matcher.find()) {
				System.out.println(input[i]);
			}
		}
		

	}

}
