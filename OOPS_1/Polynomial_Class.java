
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {
	int poly[]=new int[10];
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		
		while(degree>=poly.length){
			incSize();	
		}
			poly[degree]=coeff;
		}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0; i<poly.length; i++){
			if(poly[i]==0){
				continue;
			}
			System.out.print(poly[i]+"x"+i+" ");
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial sum =new Polynomial();
		int n=0;
		if(poly.length>p.poly.length){
			n=poly.length;
		}
		else{
			n=p.poly.length;
		}
		int p1=poly.length;
		int p2=p.poly.length;
		for(int i=0; i<n; i++){
			int sum1=0;
			if(i<p1){
				sum1+=poly[i];
			}
			if(i<p2){
				sum1+=p.poly[i];
			}
			sum.setCoefficient(i,sum1);
			
		}
		return sum;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial sub =new Polynomial();
		int n=0;
		if(poly.length>p.poly.length){
			n=poly.length;
		}
		else{
			n=p.poly.length;
		}
		int p1=poly.length;
		int p2=p.poly.length;
		for(int i=0; i<n; i++){
			int sub1=0;
			if(i<p1){
				sub1+=poly[i];
			}
			if(i<p2){
				sub1-=p.poly[i];
			}
			sub.setCoefficient(i,sub1);
			
		}
		return sub;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial mul =new Polynomial();
		
		int n=0;
		if(poly.length>p.poly.length){
			n=poly.length;
		}
		else{
			n=p.poly.length;
		}
		int p1=poly.length;
		int p2=p.poly.length;
		mul.setCoefficient(n, 0);
		for(int i=1; i<p1; i++){
		for(int j=1; j<p2; j++){
			int product=0;
			product=mul.poly[i+j];
        	product=product+(poly[i]*p.poly[j]);
			mul.setCoefficient(i+j,product);
		}
		}
		return mul;
	}
	public void incSize(){
		int temp[]=poly;
		poly = new int[2*poly.length];
		for(int i=0; i<temp.length; i++){
			poly[i]=temp[i];
		}
	}

}