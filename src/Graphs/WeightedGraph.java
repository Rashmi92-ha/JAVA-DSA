package Graphs;

import java.util.Scanner;
import java.util.ArrayList;

public class WeightedGraph {
    static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices: ");
        int num = sc.nextInt();
        System.out.println("Enter the number of Edges: ");
        int edge = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i=0 ; i<num ;  i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edge ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();

            graph.get(u).add(new Edge(v, weight));
            graph.get(v).add(new Edge(u,weight));
        }
        for(int i=0; i<num;i++){
            System.out.println(i + " -> ");
            for(Edge edge1: graph.get(i)){
            System.out.println("(" + edge1.to + " , "  + edge1.weight + ")");
            }
            System.out.println();
        }
    }
}
