import java.util.*;

public class CycleDetection {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    // DFS function
    static boolean dfs(int node, int parent) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node)) return true;
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    static boolean hasCycle(int V, int[][] edges) {
        // build adjacency list
        graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{4,0}};
        System.out.println(hasCycle(V, edges)); // Output: true
    }
}
