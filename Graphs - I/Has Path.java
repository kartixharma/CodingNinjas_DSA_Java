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
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		hasPath(edges, v1, v2);
	}
	public static void hasPath(int[][] edges, int v1, int v2){
		boolean visited[] =new boolean[edges.length];
			hasPath(edges, v1, v2, visited);
	}
	public static void hasPath(int[][] edges, int v1, int v2, boolean[] visited){
		visited[v1]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(v1);
		while(!q.isEmpty()){
			int topV = q.poll();
			if(topV==v2){
				System.out.print(true);
				return;
			}
			for(int i=0; i<edges.length; i++){
				if(edges[topV][i]==1 && !visited[i]){
					q.add(i);
					visited[i]=true;
				}
			}
		}
		System.out.print(false);
	}
}