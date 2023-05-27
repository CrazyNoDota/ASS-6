import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<V>{
    private Map<V, Vertex<V>> vertices; // contains the key and the Vertex, the edges are stored in Vertex class

    public MyGraph(){
        vertices = new HashMap<V, Vertex<V>>(); // initializing hashmap
    }

    public void addVertex(V data){ // creating a new vertex with data
        vertices.put(data, new Vertex<>(data));
    }

    public void addEdge(V sourceKey, V destinationKey, double weight){ // adding the edges by entering keys
        Vertex<V> source = vertices.get(sourceKey);
        Vertex<V> destination = vertices.get(destinationKey);
        source.addAdjacentVertex(destination, weight); // we add the path both ways
        destination.addAdjacentVertex(source, weight);
    }

    public void printGraph(){
        for(Vertex<V> vertex: vertices.values()){ // traversing the values itself of hashmap with vertices
            ArrayList<Vertex<V>> neighbours = (ArrayList<Vertex<V>>) vertex.getNeighbours();
            System.out.print("Current Vertex -> " + vertex.getData() + "  Connected vertices: ");
            for(Vertex<V> neighbour:neighbours){
                System.out.print(neighbour.getData() + " ");
            }
            System.out.println();
        }

    }

    public void removeEdge(){}

    public boolean hasEdge(){
        return false;
    }

    public List<Vertex> getNeighbours(Vertex vertex){
        return null;
    }

    public void BFS(Vertex start){

    }

    public void  Djakstra(){}




}
