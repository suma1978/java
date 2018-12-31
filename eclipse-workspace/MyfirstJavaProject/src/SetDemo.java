

import java.util.HashSet;
import java.util.Set;

/**
 * Q. Given a String(say "hello world"), print the following:
 * 	a. Index/position of duplicate characters?
 * 	b. Total number of duplicate characters?
 * Example: for String "hello world"
 *  a. Index/position of duplicate character(s): 3, 7, 9
 *  b. Total number of duplicate characters: 3
 *  
 *  Hint: whenever you see the term 'duplicate' in the question, most likely you should use 'Set' datastructure.
 */
public class SetDemo {
	public static void main(String[] args) {
		String s = "hello world";
		char[] charArray = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		
		int ctr = 0;
		for(int i=0; i<charArray.length; i++) {
			if(!set.add(charArray[i])) {
				System.out.println("Index/position of duplicate character(s): " + i);
				ctr++;
			}
		}
		System.out.println("Total number of duplicate characters: " + ctr);
	}
}
