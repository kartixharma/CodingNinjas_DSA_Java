
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		if(s.length()==1){
			return s.charAt(0)+"";
		}
		if(s.charAt(0)==s.charAt(1)){
			return s.charAt(0)+"*"+addStars(s.substring(1));
		}
		return s.charAt(0)+addStars(s.substring(1));
	}
}
