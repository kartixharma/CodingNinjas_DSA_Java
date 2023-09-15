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
	public static void printKeypad(int input){
			printKeypad1(input, "");
	}
	public static void printKeypad1(int input, String output){
		if(input==0){
				System.out.println(output);
				return;
			}
			int n=input%10;
			int n1 =input/10;
			String str=alpha(n);
			for(int i=0; i<str.length(); i++){
				printKeypad1(n1, str.charAt(i)+output);
			}
	}
}