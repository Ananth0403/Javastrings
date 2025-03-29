package base;

import java.util.Scanner;

import day1.EvenLengthWord;
import day2.InsertString;
import org.testng.Assert;
import org.testng.annotations.*;



public class DataProviderClass {
	static Scanner sc = new Scanner(System.in);
	
	@DataProvider(name="evenlengthdata")
	public static Object[][] evenLengthData() {
		// TODO Auto-generated method stub
		System.out.print("Enter the sentence for finding evenlength: ");
		String s = sc.nextLine();
		return new Object[][] {{s,0}};
//		System.out.print("Enter the String: ");
//		String st = sc.nextLine();
//		System.out.print("new string for insert: ");
//		String ne = sc.nextLine();
//		System.out.println("Enter the position: ");
//		int pos = sc.nextInt();
//		InsertString.usingCustom(st, ne, pos);
//		
//		Scanner sc = new Scanner(System.in);
//		int count=1;
//		System.out.print("Enter the String: ");
//		String st = sc.nextLine();
//		System.out.print("new string: ");
//		String ne = sc.nextLine();
//		System.out.println("Enter the position: ");
//		int pos = sc.nextInt();

	}
	
	
	@DataProvider(name="palindrome")
	public static Object[][] palindromedata() {
		System.out.println("------------Palindrome-------------");
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		int len = st.length()-1;
		return new Object[][] {{st, len}};
	}
	
	@DataProvider(name="insertstring")
	public static Object[][] insertdata() {
		System.out.println("------------Insertstring -------------");
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("new string: ");
		String ne = sc.nextLine();
		return new Object[][] {{st, ne}};
	}
	
	@DataProvider(name="checkanagram")
	public static Object[][] checkAnagram() {
		
		System.out.println("------------Anagram-------------");
		System.out.print("string1: ");
		String st = sc.nextLine();
		System.out.print("string2: ");
		String ne = sc.nextLine();
		return new Object[][] {{st, ne}};
	}
	
	@DataProvider(name="reverseStr")
	public static Object[][] reverseStr() {
		System.out.println("-----------ReverseString------------");
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		int len = s.length()-1;
		return new Object[][] {{s,len}};
	}
	
}
