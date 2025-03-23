package base;

import java.util.Scanner;

import day1.EvenLengthWord;
import day2.InsertString;
import org.testng.Assert;
import org.testng.annotations.*;



public class DataProviderClass {
	
	@DataProvider(name="evenlengthdata")
	public static Object[][] evenLengthData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		int len = st.length()-1;
		return new Object[][] {{st, len}};
	}
	
	@DataProvider(name="insertstring")
	public static Object[][] insertdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("new string: ");
		String ne = sc.nextLine();
		return new Object[][] {{st, ne}};
	}

}
