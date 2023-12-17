import java.util.ArrayList;
import java.util.HashMap;
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
		ArrayList<Integer> path = getPath(edges, v1, v2);
		if(path!=null){
			for(int i : path){
				System.out.print(i+" ");
			}
		}
	}
	public static ArrayList<Integer> getPath(int[][] edges, int v1, int v2){
		boolean visited[] =new boolean[edges.length];
		ArrayList<Integer> path = new ArrayList<>();
		return getPathBFS(edges, v1, v2, visited, path);
	}
	public static ArrayList<Integer> getPathBFS(int[][] edges, int v1, int v2, boolean[] visited, ArrayList<Integer> path){
		if(v1==v2){
			path.add(v2);
			visited[v2]=true;
			return path;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		visited[v1]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(v1);
		while(!q.isEmpty()){
			int topV = q.poll();
			for(int i=0; i<edges.length; i++){
				if(edges[topV][i]==1 && !visited[i]){
					map.put(i, topV);
					q.add(i);
					visited[i]=true;
					if(i==v2){    
						path.add(i); 
                     	while(!path.contains(v1)){
                        	int n=map.get(i);
                         	path.add(n);
                         	i=n;
                     	}
                    return path;
                    }
				}
			}
		}
		return null;
	}
}