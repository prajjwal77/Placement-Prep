package Graph;

import java.util.*;

// Class representing the graph
class Graph {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list representation of the graph

    // Constructor to initialize the graph
    Graph(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<>());
    }

    // Function to add an edge to the graph
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Since the graph is undirected
    }

    // Function to check if the graph is bipartite
    boolean isBipartite() {
        // Array to store the color of each vertex
        // 0: Not colored, 1: Group 1, -1: Group 2
        int[] color = new int[V];
        Arrays.fill(color, 0); // Initialize all vertices as not colored

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Check for all components in case the graph is not connected
        for (int i = 0; i < V; i++) {
            if (color[i] == 0) { // If vertex i is not colored
                queue.add(i);
                color[i] = 1; // Color vertex i with Group 1

                // BFS traversal
                while (!queue.isEmpty()) {
                    int u = queue.poll();

                    // Traverse all adjacent vertices
                    for (int v : adj.get(u)) {
                        if (color[v] == 0) { // If v is not colored
                            color[v] = -color[u]; // Color with opposite group
                            queue.add(v);
                        } else if (color[v] == color[u]) // If adjacent vertices have the same color
                            return false; // Graph is not bipartite
                    }
                }
            }
        }

        return true; // Graph is bipartite
    }
}

// Main class
public class IsBipartite {
    public static void main(String[] args) {
        // Create a graph with 4 vertices
        Graph g = new Graph(4);
        
        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        // Check if the graph is bipartite
        if (g.isBipartite())
            System.out.println("Graph is bipartite.");
        else
            System.out.println("Graph is not bipartite.");
    }
}
