package day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.DataProviderClass;

public class SwapTwo {
	
	@Test(dataProvider="swapTwo", dataProviderClass=DataProviderClass.class)
	public void swapTwo(String st, int n) {
		String s="";
		int i;
		for(i=0;i<n-1;i++) {
			s=s+st.charAt(i+1);
			s=s+st.charAt(i);
			i++;
		}
		if(i!=n)
			s=s+st.charAt(n-1);
		System.out.println(s);
	}

}
