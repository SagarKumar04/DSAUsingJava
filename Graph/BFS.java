package InfinityJune21.Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    static ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
    static void bfs(int source, int V) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while(queue.size() != 0) {
            //Deque
            source = queue.poll();
            System.out.print(source + " ");

            ArrayList<Integer> neighbours = adjacencyList.get(source);
            for(Integer neighbour : neighbours) {
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;

        for(int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 4);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 1, 4);
        addEdge(adjacencyList, 2, 3);
        addEdge(adjacencyList, 3, 4);

        bfs(0, V);
    }
}
