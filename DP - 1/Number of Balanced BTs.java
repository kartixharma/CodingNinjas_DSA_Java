public class Solution {
	public static long balancedBTs(long height) {  
		int mod = (int)Math.pow(10, 9) + 7;
 		return balancedBTs(height, mod);
     }
    public static long balancedBTs(long height,int mod){
        if(height==0 || height==1)
             return 1;
        long x=balancedBTs(height-1,mod);
        long y=balancedBTs(height-2,mod);
        long a=(long)x*x;
        long b=(long)x*y*2;
        long resa=(long)(a%mod);
        long resb=(long)(b%mod);
        return (resa+resb)%mod;        
	}
}