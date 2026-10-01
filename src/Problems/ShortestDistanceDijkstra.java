package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ShortestDistanceDijkstra {
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
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    static int shortestDistance(ArrayList<ArrayList<Edge>> graph , int start , int destination){
        int num = graph.size();
        int[] distance = new int[num];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start] = 0;
        PriorityQueue<Node> priority = new PriorityQueue<>((a,b) -> Integer.compare(a.distance ,b.distance));
        priority.add(new Node(start, 0));
        while(!priority.isEmpty()){
            Node current = priority.poll();

            int currentVertex = current.vertex;
            int currentDistance = current.distance;

            if(currentDistance != distance[currentVertex]){
                continue;
            }
            for(Edge edge: graph.get(currentVertex)){
                int newDistance = currentDistance + edge.weight;

                if(newDistance < distance[edge.to]){
                    distance[edge.to] = newDistance;
                    priority.add(new Node(edge.to , newDistance));
                }
            }
        }
        return distance[destination];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices: ");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int edge= sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i=0; i<vertices; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edge ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();

            graph.get(u).add(new Edge(v,weight));
            graph.get(v).add(new Edge(u,weight));
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        int result = shortestDistance(graph,source,destination);
        System.out.println("Shortest distance: " + result);
    }
}


