package day2;

import java.util.Scanner;

public class InsertString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("new string: ");
		String ne = sc.nextLine();
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		usingCustom(st, ne, pos);
		
	}
	public static void usingInBuilt(String old, String newSt, int pos) {
		StringBuilder sb = new StringBuilder();
		sb.append(old);
		sb.insert(pos, newSt);
		System.out.println(sb);
	}
	public static void usingCustom(String old, String newSt, int pos) {
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
	}

}
