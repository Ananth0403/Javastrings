package day6;

import org.testng.annotations.Test;

import base.DataProviderClass;
import base.Helper;

public class ReplaceChar {
	
	@Test(dataProvider="replaceChar", dataProviderClass=DataProviderClass.class)
	public void replaceChar( Helper helper) {
		char[] arr = helper.s().toCharArray();
		arr[helper.pos()]=helper.c();
		System.out.println(new String(arr));
	}
}
