package base;

public class Helper {
	
	private int pos;
	private String s;
	private char c;
	public Helper(int pos, String s, char c) {
		this.pos=pos;
		this.s=s;
		this.c=c;
	}
	public String s() {
		return s;
	}
	public char c() {
		return c;
	}
	public int pos() {
		return pos;
	}

}
