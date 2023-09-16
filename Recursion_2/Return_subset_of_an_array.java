public class solution {
	public static int[][] subsets(int input[]) {
		if(input.length==0){
			int arr[][]=new int[1][0];
			return arr;
		}
		int arr[]=new int[input.length-1];
		for(int i=1; i<input.length; i++){
			arr[i-1]=input[i];
		}
		int sans[][]=subsets(arr);
		int ans[][]=new int[sans.length*2][];
		for(int i=0; i<sans.length; i++){
			ans[i]=new int[sans[i].length];
			for(int j=0; j<sans[i].length; j++){
				ans[i][j]=sans[i][j];
			}
		}
		for(int i=0; i<sans.length; i++){
			ans[i+sans.length]=new int[sans[i].length+1];
			ans[i+sans.length][0]=input[0];
			for(int j=1; j<=sans[i].length; j++){
				ans[i+sans.length][j]=sans[i][j-1];
			}
		}
		return ans;
	}
}
