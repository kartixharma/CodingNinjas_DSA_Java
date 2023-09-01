public class solution {

	public static int sumOfDigits(int input){
		int rem = input%10;
		input=input/10;
		if(Integer.toString(input).length()==1){
			return rem+input;
		}
		return rem+sumOfDigits(input);
	}
}
