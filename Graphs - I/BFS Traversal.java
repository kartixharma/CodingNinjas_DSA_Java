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
		BFS(edges);
	}
	public static void BFS(int[][] edges){
		boolean visited[] =new boolean[edges.length];
		for(int i=0; i<visited.length; i++){
		if(!visited[i])
			BFS(edges, i, visited);
		}
	}
	public static void BFS(int[][] edges, int sv, boolean[] visited){
		visited[sv]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		while(!q.isEmpty()){
			int topV = q.poll();
			for(int i=0; i<edges.length; i++){
				if(edges[topV][i]==1 && !visited[i]){
					q.add(i);
					visited[i]=true;
				}
			}
			System.out.print(topV+" ");
		}
	}
}