import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		DFS(edges);
	}
	public static void DFS(int[][] edges){
		boolean visited[] =new boolean[edges.length];
		for(int i=0; i<visited.length; i++){
			ArrayList<Integer> arr = new ArrayList<>();
			if(!visited[i])
				DFS(edges, i, visited, arr);
				Collections.sort(arr);
				for(int c : arr){
					System.out.print(c+" ");
				}
				System.out.println();
		}
	}
	public static void DFS(int[][] edges, int sv, boolean[] visited, ArrayList<Integer> arr){
		visited[sv] = true;
		int n = edges.length;
		arr.add(sv);
		for (int i=0; i<n; i++){
			if(edges[sv][i]==1 & !visited[i]) {
				DFS(edges, i, visited, arr);	
			}
		}
	}
}