package day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DataProviderClass;

public class Reversestr {
	
	@Test(dataProvider="reverseStr", dataProviderClass = DataProviderClass.class)
	public void reverseStr(String s, int len) {
		String ans = "";
		while(len>=0) {
			ans=ans+s.charAt(len);
			len--;
		}
		System.out.println("reversed string : "+ans);
		Assert.assertTrue(true);
		
	}
	
}
