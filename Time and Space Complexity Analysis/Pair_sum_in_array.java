import java.util.Arrays;
public class Solution {	
	public static int pairSum(int[] arr, int num) {
		int si=0;
		int ei=arr.length-1;
		int pairCnt=0;
		Arrays.sort(arr);
		while(si<ei){
			if(arr[si]+arr[ei]<num){
				si++;
			}
			else if(arr[si]+arr[ei]>num){
				ei--;
			}
			else{
				if(arr[si]==arr[ei]){
					int elCnt=ei-si+1;
					pairCnt+=(elCnt*(elCnt-1))/2;
					return pairCnt;
				}
				int tmpsi=si+1;
				int tmpei=ei-1;
				while(si<=ei && arr[si]==arr[tmpsi]){
					tmpsi++;
				}
				while(si<=ei && arr[ei]==arr[tmpei]){
					tmpei--;
			}
			int siElCnt=tmpsi-si;
			int eiElCnt=ei-tmpei;
			pairCnt+=siElCnt*eiElCnt;
			si=tmpsi;
			ei=tmpei;
		}
	}
	return pairCnt;
	}

}