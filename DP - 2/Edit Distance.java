public class Solution {	
	public static int editDistance(String s1, String s2){
        if(s1.length()==0 && s2.length()==0)
            return 0;
        if(s2.length()==0)
            return s1.length();
        if(s1.length()==0)
            return s2.length();
        if(s1.charAt(0)==s2.charAt(0))
            return editDistance(s1.substring(1),s2.substring(1));
        else{
            return 1+Math.min(editDistance(s1,s2.substring(1)),Math.min(editDistance(s1.substring(1),s2),editDistance(s1.substring(1),s2.substring(1))));
  
        }
    }
}