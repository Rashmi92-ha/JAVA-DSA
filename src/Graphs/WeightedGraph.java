package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;
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
    static class Node{
        int vertex;
        int distance;
        Node(int vertex, int distance){
            this.vertex =vertex;
            this.distance = distance;
        }
    }
    static void dijkstra(ArrayList<ArrayList<Edge>> graph , int start){
        int num = graph.size();
        int[] distance = new int[num];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start] = 0;
        PriorityQueue<Node> priority = new PriorityQueue<>((a,b ) -> Integer.compare(a.distance,b.distance));
        priority.add(new Node(start,0));
        while (!priority.isEmpty()){
          Node current = priority.poll();
          int currentVertex = current.vertex;
          int currentDistance = current.distance;

          if(currentDistance !=distance[currentVertex]){
              continue;
          }
          for(Edge edge: graph.get(currentVertex)){
              int newDistance = currentDistance + edge.weight;
              if(newDistance < distance[edge.to]){
                  distance[edge.to] = newDistance;
                  priority.add(new Node(edge.to, newDistance));
              }
          }

        }
        for(int i=0; i<num;i++){
            System.out.println("Shortest Distance from " + start + " to " + i + " = " + distance[i]);
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
        dijkstra(graph,0);
    }
}
