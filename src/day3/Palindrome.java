package day3;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Palindrome {

	
	@Test
	public static void fun() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String st = sc.nextLine(), s="";
		int len = st.length()-1, i=0;
		while(len>=0) {
			s=s+st.charAt(len);
			len--;
		}
		Assert.assertNotEquals(st, s);
//		if(st.equals(s))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not palindrome");
		

	}

}
