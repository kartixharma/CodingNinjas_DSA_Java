import java.util.HashMap;
public class Solution {
	public static String uniqueChar(String str){
		HashMap<Character, Integer> freq = new HashMap<>();
		String str1="";
		for(int i=0; i<str.length(); i++){
			if(freq.containsKey(str.charAt(i))){
				continue;
			}
			str1+=str.charAt(i)+"";
			freq.put(str.charAt(i), 0);
		}
		return str1;
	}
}