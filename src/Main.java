public class Main {
    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>();

        // Create vertices
        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);

        graph.printGraph();
    }
}