public class Solution {
    public static boolean isPalindrome(String str) {
        return isPalindrome1(str,0,str.length()-1);
    }
    public static boolean isPalindrome1(String str, int s, int l){
        if(s>=l){
            return true;
        }
        if(!(str.charAt(s)==str.charAt(l))){
            return false;
        }
         return isPalindrome1(str, s+1,l-1);
    }
}
