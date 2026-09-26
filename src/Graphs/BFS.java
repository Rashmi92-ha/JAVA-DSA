package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static void bfs(ArrayList<ArrayList<Integer>> graph,  int start){
        boolean[] visited = new boolean[graph.size()];
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.println(current + "  ");
            for(int neighbour : graph.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(3);
        graph.get(3).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(3).add(2);
        graph.get(2).add(3);

        bfs(graph,0);
    }
}
