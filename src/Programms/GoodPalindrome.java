package Programms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodPalindrome {

	public static void main(String[] args) throws IOException {

		System.out.println(" PRogramm to find the number of charactes to be swapped inside string 2 to make the palindrome of string one");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter the String 1 :");
		String s1 = br.readLine();
		System.out.println("enter the String 2 :");
		String s2 = br.readLine();
		
		int result = result(s1,s2);
		System.out.println(result);
	}

	public static int result(String s1, String s2) {
		int  len1 = s1.length();
		int len2 = s2.length();
		if(len1!=len2)
			return -1;

		int ptr = len1-1;
		int ptr1 = 0;
		int ptr2 = len2-1;
		int count = 0;
		
		while(ptr>=0){
			if(s1.charAt(ptr1)!=s2.charAt(ptr2))
				count++;
			ptr1++;
			ptr2--;
			ptr--;
		}
		return count;
	}
}
