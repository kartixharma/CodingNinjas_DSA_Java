public class solution {
	
	public static String[] permutationOfString(String input){
		if(input.length()==0){
			String ans[]={""};
			return ans;
		}
		int n=1;
		for(int i=1; i<=input.length(); i++){
			n*=i;
		}
		int x=0;
		String ans[]=new String[n];
		for(int i=0; i<input.length(); i++){
			String smallans[]=permutationOfString(input.substring(0,i)+input.substring(i+1));
			for(int j=0; j<smallans.length; j++){
				ans[x++]=input.charAt(i)+smallans[j];
			}
		}
		return ans;
	}
}
