import java.lang.Math;
public class solution {
	public static double findGeometricSum(int k){
		if(k==0){
			return 1;
		}
		double k1=1/Math.pow(2,k);
		return k1+findGeometricSum(k-1);
	}
}
