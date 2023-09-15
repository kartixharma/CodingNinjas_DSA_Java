public class solution {
	public static String alpha(int n){
		switch(n){
			case 2:
			return "abc";
			case 3:
			return "def";
			case 4:
			return "ghi";
			case 5:
			return "jkl";
			case 6:
			return "mno";
			case 7:
			return "pqrs";
			case 8:
			return"tuv";
			case 9:
			return "wxyz";
		}
		return "";
	}
	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		if(n==0|| n==1){
			String str[]={""};
			return str;
		}
		int n1=n%10;
		n1=(n-n1)/10;
		String str[]=keypad(n1);
		String str1=alpha(n%10);
		String fstr[]=new String[str1.length()*str.length];
		int x=0;
		for(int i=0; i<str.length; i++){
		for(int j=0; j<str1.length(); j++){
			fstr[x++]=str[i]+str1.charAt(j);
			}
		}
		return fstr;		
	}	
}
