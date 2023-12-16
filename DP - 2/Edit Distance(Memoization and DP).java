public class Solution {
   public static int editDistance(String s, String t){
       int m=s.length();
       int n=t.length();
       if(m==0 && n==0)
           return 0;
       if(m==0)
           return n;
       if(n==0)
           return m;
       int storage[][]=new int[m+1][n+1];
       storage[0][0]=0;
       for(int i=1;i<=n;i++)
           storage[0][i]=i;
       for(int i=1;i<=m;i++)
           storage[i][0]=i;
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
               if(s.charAt(m-i)==t.charAt(n-j))
               {
                   storage[i][j]=storage[i-1][j-1];
               }
               else{
                   storage[i][j]=1+Math.min(Math.min(storage[i-1][j],storage[i][j-1]),storage[i-1][j-1]);
               }
               }
       }
       return storage[m][n];
   }
}