public class solution {
	public static int countZerosRec(int input){
			if(input<9){
				if(input==0){
					return 1;
				}
				else{
					return 0;
			}
		}
		if(input%10==0){
			input=input/10;
			return 1+countZerosRec(input);
		}
		input=input/10;
		return countZerosRec(input);
	}
}
