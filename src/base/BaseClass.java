package base;

import java.util.Scanner;

import day1.EvenLengthWord;
import day2.InsertString;

public class BaseClass {

	public static void Base() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence for finding evenlength: ");
		String s = sc.nextLine();
		EvenLengthWord df = new EvenLengthWord();
		df.evenLength(s);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("new string for insert: ");
		String ne = sc.nextLine();
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		InsertString.usingCustom(st, ne, pos);
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("new string: ");
		String ne = sc.nextLine();
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();

	}

}
