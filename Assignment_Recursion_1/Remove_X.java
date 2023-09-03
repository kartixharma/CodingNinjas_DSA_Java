public class solution {
	public static String removeX(String input){
		if(input.length()==0){
			return "";
		}
		if(input.charAt(0)!='x'){
			return input.charAt(0)+removeX(input.substring(1));
		}
		return removeX(input.substring(1));
	}
}
