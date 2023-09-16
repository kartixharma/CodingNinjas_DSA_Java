public class Solution {
	
		
     public static int staircase(int n){
		 if(n==0 || n==1 || n==2){
			 return n;
		 }
		 if(n==3){
			 return 4;
		 }
		 return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}
	
}