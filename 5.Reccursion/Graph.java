import java.util.*;

class Graph {
    private int vertices;
    private Map<Integer, List<Edge>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int from, int to, int weight) {
        adjList.get(from).add(new Edge(to, weight));
    }

    private static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public int findMaxCostSum() {
        int maxCostSum = Integer.MIN_VALUE;
        for (int vertex = 0; vertex < vertices; vertex++) {
            Set<Integer> visited = new HashSet<>();
            maxCostSum = Math.max(maxCostSum, dfs(vertex, visited, 0));
        }
        return maxCostSum;
    }

    private int dfs(int vertex, Set<Integer> visited, int currentCost) {
        if (visited.contains(vertex)) {
            return 0;
        }

        visited.add(vertex);

        int maxPathCost = currentCost;
        for (Edge edge : adjList.get(vertex)) {
            maxPathCost = Math.max(maxPathCost, dfs(edge.to, visited, currentCost + edge.weight));
        }

        visited.remove(vertex);
        return maxPathCost;
    }



    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 3, 5);

        int maxCostSum = graph.findMaxCostSum();
        System.out.println("Maximum cost sum of all paths: " + maxCostSum);
    }

}