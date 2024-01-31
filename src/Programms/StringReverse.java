package Programms;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("program to reverse a string using java 8 chars() mapToObj() reduce() function");
		String str = "ABCDE";
		String rev = reverseMethod(str);
		System.out.println(rev);
	}

	public static String reverseMethod(String str) {
		String rev = str.chars().mapToObj(c-> String.valueOf((char) c)).reduce((s1, s2)->(s2+s1)).orElse("");
		return rev;
	}
}
