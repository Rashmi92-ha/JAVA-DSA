package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionUndirected {
    static boolean dfsCycle(ArrayList<ArrayList<Integer>> graph, int current, int parent, boolean[] visited){
        visited[current] = true;
        for(int neigbhor : graph.get(current)){
            if(!visited[neigbhor]){
               if(dfsCycle(graph,neigbhor,current,visited)){
                   return true;
               }
            }else if(neigbhor != parent){
                return false;
            }
        }
        return false;
    }
    static boolean hasCycle(ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];
        for(int i=0; i<graph.size();i++){
            if(!visited[i]){
                if(dfsCycle(graph,i,-1, visited));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<vertices ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println("Has Cycle: " + hasCycle(graph));
    }
}

