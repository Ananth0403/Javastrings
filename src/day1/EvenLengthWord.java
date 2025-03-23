package day1;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DataProviderClass;



public class EvenLengthWord  {
	Scanner sc = new Scanner(System.in);
	int count=1;

	@Test(dataProvider = "evenlengthdata",dataProviderClass = DataProviderClass.class)
	public void evenLength(String s, int c) {
		
		String[] words = s.split("[\\s,]+");
		for(String w:words) {
			if(w.length()%2==0) {
				c=1;
				System.out.println("..."+ w);
			}
		}
		Assert.assertEquals(c, 1);
	}
}
//	public void replaceA() {
//		String s = "anaantha";
//		StringBuilder sb = new StringBuilder();
//		s.replace('a', '#');
//		for(int i=1;i<s.length()+1;i++) {
//			if(s.charAt(i-1)=='a') {
//				for(int j=0;j<count;j++) {
//					sb.append('#');
//				}
//				count++;
//			}
//			else {
//				sb.append(s.charAt(i-1));
//			}
//		}
//		System.out.println(sb);
//	}
//}
