
public class solution {

	public static int convertStringToInt(String input){
		if(input.length()==0){
			return 0; 
		}
		int n=input.length();
		int a=input.charAt(0);
		a-=48;
		while(n>1){
			a*=10;
			n--;
		}
		return a+convertStringToInt(input.substring(1));
	}
}
