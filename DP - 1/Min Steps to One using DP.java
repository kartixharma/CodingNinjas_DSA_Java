public class Solution {
	public static int countMinStepsToOne(int n) {
		int[] storage = new int[n+1];
		storage[1] = 0;
		for(int i=2; i<n+1; i++){
			int min = storage[i-1];
			if(i%2==0){
				min = Math.min(min, storage[i/2]);
			}
			if(i%3==0){
				min = Math.min(min, storage[i/3]);
			}
			storage[i]=min+1;
		}
		return storage[n];
	}
}