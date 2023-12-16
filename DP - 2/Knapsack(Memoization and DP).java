public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int storagePrev[] = new int[maxWeight+1];
        int storageCurrent[] = new int [maxWeight+1];
        for(int i=1;i<value.length+1;i++){
            for(int w = 1;w<maxWeight+1;w++){
                if(weight[i-1]>w){
                    storageCurrent[w] = storagePrev[w];
                }
                else { 
                storageCurrent[w]= Math.max(storagePrev[w - weight[i-1]]+ value[i-1],storagePrev[w]);
                }
            }
                storagePrev = storageCurrent ;
                storageCurrent = new int[maxWeight+1];
        }
        return storagePrev[maxWeight];
    }
}