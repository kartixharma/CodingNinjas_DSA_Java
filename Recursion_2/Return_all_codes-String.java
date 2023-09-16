public class solution {
	public static  String[] getCode(String input){
		if(input.length()==0){
			String ans[]={""};
			return ans;
		}
		if(input.length()==1){
			int n=input.charAt(0)-'0';
			char s=(char)(n+'a'-1);
			String ans[]={s+""};
			return ans;
		}
		int n=input.charAt(0)-'0';
	    int n1=Integer.parseInt(input.substring(0,2));
		char s=(char)(n+'a'-1);
		char s1=(char)(n1+'a'-1);
		if(n1<=26 && n1>=10){
			String sans[]=getCode(input.substring(1));
			String sans2[]=getCode(input.substring(2));
			String ans[] = new String[sans.length+sans2.length];
			int x=0;
			for(int i=0; i<sans.length; i++){
				ans[x++]=s+sans[i];
			}
			for(int i=0; i<sans2.length; i++){
				ans[x++]=s1+sans2[i];
			}
			return ans;
		}
		int x=0;
			String sans[]=getCode(input.substring(1));
			String ans[] = new String[sans.length];
			for(int i=0; i<sans.length; i++){
				ans[x++]=s+sans[i];
			}
			return ans;
	}

}
