public class Solution {
    public static int balancedBTs(int height){
        if(height==0 || height==1)
            return 1;
        if(height==2)
            return 3;
        int storage[]=new int[height+1];
        storage[0]=1;
        storage[1]=1;
        storage[2]=3;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=3; i<storage.length; i++){  
    		int x = storage[i-1];
            int y = storage[i-2];
            long a = (long)x*x;
            long b = (long)x*y*2;
            int v1 = (int)(a%mod);
            int v2 = (int)(b%mod);
            storage[i] = (v1+v2)%mod;
        }
        return storage[height];
    }
}
