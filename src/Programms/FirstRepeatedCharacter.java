package Programms;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "seema";
		boolean isFound = false;
		for(int i = 0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
				isFound =true;
			}
		}
		if(isFound) {
			System.out.println(str.charAt(i)+" is the first repeated charater");
			break;
		}
			
	}
		System.out.println("using set collection:");
		//using collection i.e set
		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(!set.add(str.charAt(i))) {
				System.out.println("first repeated character is "+str.charAt(i));
				break;
			}
		}
}
}