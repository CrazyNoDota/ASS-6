public class Main {
    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>();

        // Create vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);

        graph.addEdge(0,1,10);
        graph.addEdge(0,2,20);
        graph.addEdge(0, 3, 30);
        graph.addEdge(0,4,40);
        graph.addEdge(1,5,50);
        graph.addEdge(1,6,40);
        graph.addEdge(2,7,40);



        graph.BFS(0);
    }
}