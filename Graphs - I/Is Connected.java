import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {

        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int edges[][] = new int[v][v];
		for(int i=0; i<e; i++){
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			edges[sv][ev]=1;
			edges[ev][sv]=1;
		}
		isConnected(edges);
	}
	public static void isConnected(int edges[][], int sv, boolean visited[]) {
		if(edges.length==0){
			return;
		}		
		visited[sv] = true;
		int n = edges.length;
		for (int i=0; i<n; i++){
			if(edges[sv][i]==1 & !visited[i]) {
				isConnected(edges, i, visited);
			}
		}
	}
	public static void isConnected(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		isConnected(edges, 0, visited);
		for(boolean i : visited){
			if(i==false){
				System.out.print(false);
				return;
			}
		}
		System.out.print(true);
		}
}