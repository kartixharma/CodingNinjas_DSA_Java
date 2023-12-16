public class Solution {
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		 return knapsack(weights , 0, values, maxWeight,n);
    }
    public static int knapsack(int[] weights, int sIndex, int values[], int maxWeight, int n){
        if(sIndex==weights.length)
            return 0;
        if(weights[sIndex]>maxWeight)
        	return knapsack(weights,sIndex+1,values,maxWeight,n-1);
        else{     
            int op2=values[sIndex]+knapsack(weights,sIndex+1,values,maxWeight-weights[sIndex],n-1);
            int op3=knapsack(weights,sIndex+1,values,maxWeight,n-1);
            return  Math.max(op2,op3);
        }
	}
}