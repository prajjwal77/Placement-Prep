import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class GraphBFS {
     static class Graph {
          private int vertices; // Number of vertices
          private List<List<Integer>> adjList; // Adjacency list

          public Graph(int v) {
               this.vertices = v;
               adjList = new ArrayList<>(v);
               for (int i = 0; i < v; i++) {
                    adjList.add(new ArrayList<>());
               }
          }

          public void addEdge(int u, int v) {
               adjList.get(u).add(v);
               adjList.get(v).add(u); // For undirected graph
          }
          public List<Integer> getAdjacencyList(int v) {
               return adjList.get(v);
          }
      public void bfs(int startNode) {
               boolean[] visited = new boolean[vertices];
               Queue<Integer> queue = new LinkedList<>();
               List<Integer> bfsOrder = new ArrayList<>();

               visited[startNode] = true;
               queue.add(startNode);

               while (!queue.isEmpty()) {
                    int node = queue.poll();
                    bfsOrder.add(node);

                    for (int neighbor : adjList.get(node)) {
                         if (!visited[neighbor]) {
                              visited[neighbor] = true;
                              queue.add(neighbor);
                         }
                    }
               }

               System.out.println("BFS Order: " + bfsOrder);
          }
     }

     public static void main(String[] args) {
          Graph graph = new Graph(5);
          graph.addEdge(0, 1);
          graph.addEdge(0, 2);
          graph.addEdge(1, 3);
          graph.addEdge(1, 4);
          graph.addEdge(2, 4);

          System.out.println("Starting BFS from node 0:");
          graph.bfs(0); // Starting BFS from node 0

          System.out.println("Starting BFS from node 1:");
          graph.bfs(1); // Starting BFS from node 1
     }
}
