import java.util.ArrayList;
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
		ArrayList<Integer> path = getPath(edges, v1, v2);
		if(path!=null){
			for(int i : path){
				System.out.print(i+" ");
			}
		}
	}
	public static ArrayList<Integer> getPathDFS(int edges[][], int v1, int v2, boolean visited[], ArrayList<Integer> path) {
		if(v1==v2){
			visited[v1]=true;
			path.add(v2);
			return path;
		}
		visited[v1] = true;
		int n = edges.length;
		for (int i=0; i<n; i++){
			if(edges[v1][i]==1 & !visited[i]) {
				ArrayList<Integer> arr = getPathDFS(edges, i, v2, visited, path);
				if(arr!=null){
					path.add(v1);
					return arr;
				}
			}
		}
		return null;
	}
	public static ArrayList<Integer> getPath(int edges[][], int v1, int v2) {
		boolean visited[] = new boolean[edges.length];
		ArrayList<Integer> path = new ArrayList<>();
		return getPathDFS(edges, v1, v2, visited, path);
		}
}