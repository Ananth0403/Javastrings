package day1;

import java.util.Scanner;

public class EvenLengthWord {
	Scanner sc = new Scanner(System.in);
	int count=1;

	public static void main(String[] args) {
		EvenLengthWord obj = new EvenLengthWord();
		obj.evenLength();
		obj.replaceA();
	}
	public void evenLength() {
		System.out.print("Enter the sentence: ");
		String s = sc.nextLine();
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
