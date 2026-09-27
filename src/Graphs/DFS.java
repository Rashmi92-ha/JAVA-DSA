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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<num ; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);

        // 0 -- 3
        graph.get(0).add(3);
        graph.get(3).add(0);

        // 1 -- 2
        graph.get(1).add(2);
        graph.get(2).add(1);

        // 3 -- 2
        graph.get(3).add(2);
        graph.get(2).add(3);

        boolean[] visited = new boolean[num];

        dfs(graph, 0, visited);
    }
}
