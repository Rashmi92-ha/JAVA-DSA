package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    static void dfs(ArrayList<ArrayList<Integer>> graph, int current , boolean[] isVisited){
        isVisited[current] = true;
        System.out.println(current);
        for(int neighbour: graph.get(current)){
            if (!isVisited[neighbour]) {
                dfs(graph,neighbour,isVisited);
            }
        }
    }
    static int countComponent(ArrayList<ArrayList<Integer>> graph ){
        boolean[] visited = new boolean[graph.size()];
        int count = 0;
        for(int i=0 ; i< graph.size();i++){
           if(!visited[i]){
               count++;
               dfs(graph,i,visited);
           }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices: ");
        int num = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<num ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println("DFS Traversal: ");
        System.out.println("Component Count: " + countComponent(graph));
    }
}
