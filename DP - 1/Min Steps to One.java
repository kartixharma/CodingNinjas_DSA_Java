public class Solution {
	public static int countMinStepsToOne(int n) {
		if(n==1){
			return 0;
		}
		int min=countMinStepsToOne(n-1);
		if(n%2==0){
			min= Math.min(min, countMinStepsToOne(n/2));
		}
		if(n%3==0){
			min= Math.min(min, countMinStepsToOne(n/3));
		}
		return min+1;
	}
}