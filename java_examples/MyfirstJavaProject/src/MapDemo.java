

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





/**
 * Q. Given a String, print each character and number of its occurences.
 * Example: for String "hello world", print:
 *  					h=1
 * 					l=3
 * 					etc..
 * 
 * Hint: Whenever you need to store 'key-value' pairs, you should use 'Map' datastructure.		
 */
public class MapDemo {
	public static void main(String[] args) {
String s = "hello world";
		
		char[] charArr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: charArr) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c) + 1);
			}
		}
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		mapprice();
	}
	public static void mapprice()
	{
		String[] Items={"Apple","Orange","Grapes"};
		Integer[] Price= {10,10,20};
		
		List<String> items=new ArrayList<String>(Arrays.asList(Items));
		List<Integer> price=new ArrayList<Integer>(Arrays.asList(Price));
		
		System.out.println(items.size());
		System.out.println(price.size());
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		int i=0;
		for(String str:items)
		{
			map.put(str, price.get(i)*2);
			i++;
			
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		
		
		
		
		
		
		
	}
}
