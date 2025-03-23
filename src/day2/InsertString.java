package day2;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DataProviderClass;

public class InsertString {

	
//	public static void usingInBuilt(String old, String newSt, int pos) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(old);
//		sb.insert(pos, newSt);
//		System.out.println(sb);
//	}
	
	@Test(dataProvider="insertstring", dataProviderClass = DataProviderClass.class)
	public static void usingCustom(String old, String newSt) {
		System.out.println("Enter the position: ");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		String s ="";
		int count=0, flag=0;
		for(int i=0;i<old.length();i++) {
			
			if(pos==old.length()) {
				for(int j=0;j<newSt.length();j++) {
					old=old+newSt.charAt(j);
				}
				System.out.println(old);
				return;
			}
			
			if(i>=pos && count<newSt.length()) {
				s=s+newSt.charAt(i-pos);
				count++;
			}
			else {
				s=s+old.charAt(i);
			}
			if(count==newSt.length() && flag==0) {
				flag=1;
				i=pos-1;
			}
		}
		System.out.println(s);
		Assert.assertTrue(true);
	}

}
