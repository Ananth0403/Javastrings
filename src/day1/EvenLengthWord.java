package day1;

import java.util.Scanner;

import base.BaseClass;

public class EvenLengthWord extends BaseClass {
	Scanner sc = new Scanner(System.in);
	int count=1;

	public static void main(String[] args) {
		
//		obj.replaceA();
	}
	public void evenLength(String s) {
		
		String[] words = s.split("[\\s,]+");
		for(String w:words) {
			if(w.length()%2==0) {
				System.out.println(w);
			}
		}
	}
	public void replaceA() {
		String s = "anaantha";
		StringBuilder sb = new StringBuilder();
		s.replace('a', '#');
		for(int i=1;i<s.length()+1;i++) {
			if(s.charAt(i-1)=='a') {
				for(int j=0;j<count;j++) {
					sb.append('#');
				}
				count++;
			}
			else {
				sb.append(s.charAt(i-1));
			}
		}
		System.out.println(sb);
	}
}
