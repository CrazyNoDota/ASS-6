public class Main {
    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>();

        // Create vertices
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1,2,10);
        graph.addEdge(2,3,20);
        graph.addEdge(3, 4, 30);
        graph.addEdge(4,1,40);
        graph.addEdge(3,2,50);
        graph.addEdge(3,1,40);

        graph.removeEdge(1,4);
        graph.printGraph();
    }
}