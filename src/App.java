import entities.Graph;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph(12);
        graph.addEdge(0, 1);
         graph.addEdge(8, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 11);
        graph.addEdge(0, 6);
        graph.addEdge(3, 6);
        graph.addEdge(10, 3);
        graph.addEdge(7, 11);
        graph.addEdge(7, 8);
        graph.addEdge(11, 8);
        graph.addEdge(2, 0);
        graph.addEdge(6, 2);
        graph.addEdge(5, 2);
        graph.addEdge(5, 10);
        graph.addEdge(5, 0);
        graph.addEdge(8, 1);
        graph.addEdge(4, 1);

        System.out.println("Graph created with 12 vertices and the following edges:");
        for (int v = 0; v < graph.V(); v++) {
            System.out.print(v + ": ");
            for (int w : graph.adj(v)) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
}