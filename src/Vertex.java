import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vertex<V>{
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices; // hashmap contains vertices as keys and weight as values
    public Vertex(V data){ // constructor
        this.data = data;
        adjacentVertices = new HashMap<>();
    }
    public void addAdjacentVertex(Vertex<V> destination, double weight){ // to add new connection
        adjacentVertices.put(destination, weight);
    }

    public V getData(){
        return data;
    }

    public List<Vertex<V>> getNeighbours(){ // to get all the vertices that are connected to this
        ArrayList<Vertex<V>> neighbours = new ArrayList<>();
        for(Vertex<V> vertex: adjacentVertices.keySet()){
            neighbours.add(vertex);
        }
        return neighbours;
    }
}
