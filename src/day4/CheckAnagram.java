package day4;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DataProviderClass;

public class CheckAnagram {
	 
	
	@Test(dataProvider="checkanagram", dataProviderClass = DataProviderClass.class)
	public void checkAnagram(String s, String n) {
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		if(s.length()!=n.length()) {
			System.out.println("Not anagram");
			Assert.assertFalse(true);
		}
		else {
			for(int i=0;i<s.length();i++) {
				mp.put(s.charAt(i), 1);
			}
			for(int i=0;i<n.length();i++) {
				if(mp.get(n.charAt(i))==null) {
					System.out.println("Not anagram");
					Assert.assertFalse(true);	
				}
			}
		}
		System.out.println("Anagram");
		Assert.assertTrue(true);	
	}
}
