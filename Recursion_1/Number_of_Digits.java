public class Solution {
    static int i=0;
    public static int countDigits(int n){
        i++;
        if(n/10==0){
            return i;
        }
        countDigits(n/10);
        return i;
    }
}
