import java.util.Arrays;
public class Solution {	
	public static int tripletSum(int[] arr, int num){
    Arrays.sort(arr);
    int ans = 0;
    for(int i=0; i<arr.length; i++){
      int j = i+1;
      int k = arr.length-1;
      while(j<k){
        int sum = arr[i]+arr[j]+arr[k];
        if(sum==num){
          ans++;
          int tk=k-1;
          while(tk>j){
            if(arr[tk]==arr[k]){
              ans++;
              tk--;
            }
            else{
              break;
            }
          }
          j++;
        }
        else if(sum<num){
          j++;
        }
        else{
          k--;
        }
      }
    }
    return ans;
	}
}