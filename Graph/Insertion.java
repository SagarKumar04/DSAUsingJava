package InfinityJune21.Graph;

import java.util.ArrayList;

public class Insertion {
    static void printGraph(ArrayList<ArrayList<Integer>> adjacencyList) {
        System.out.println("List is:");
        System.out.println(adjacencyList);

        for(int i = 0; i < adjacencyList.size(); i++) {
            System.out.println("List at vertex " + i + ": ");
            System.out.print(i);
            for(int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print("->" + adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

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

        printGraph(adjacencyList);
    }
}
