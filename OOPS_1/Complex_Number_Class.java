/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	private int rl;
	int rl1;
	private int im;
	public ComplexNumbers(int real, int imag){
		rl=real;
		rl1=real;
		im=imag;
	}
	public void plus(ComplexNumbers c2){
		rl+=c2.rl;
		im+=c2.im;
	}
	public void print(){
		System.out.print(rl+" + i"+im);
	}
	public void multiply(ComplexNumbers c2){
		rl=(rl*c2.rl)-(im*c2.im);
		im=(rl1*c2.im)+(im*c2.rl);
	}
}
