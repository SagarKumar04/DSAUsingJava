package InfinityJune21.Graph;

import java.util.ArrayList;

public class DFS {
    static int V = 5;
    static ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    static void dfs(int source) {
        boolean visited[] = new boolean[V];
        dfsUtility(source, visited);
    }

    static void dfsUtility(int source, boolean visited[]) {
        visited[source] = true;
        System.out.print(source + " ");

        ArrayList<Integer> adjacent = adjacencyList.get(source);
        for(Integer adj : adjacent) {
            if(!visited[adj]) {
                dfsUtility(adj, visited);
            }
        }
    }

    public static void main(String[] args) {
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

        dfs(0);
    }
}
