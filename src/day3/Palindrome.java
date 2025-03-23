package day3;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DataProviderClass;

public class Palindrome extends DataProviderClass {

	
	@Test(dataProvider = "palindrome",dataProviderClass = DataProviderClass.class)
	public static void fun(String st, int len) {
		String s="";
		int i=0;
		while(len>=0) {
			s=s+st.charAt(len);
			len--;
		}
		Assert.assertEquals(st, s);
//		if(st.equals(s))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not palindrome");
		

	}
}
