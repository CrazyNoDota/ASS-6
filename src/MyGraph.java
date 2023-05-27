import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<V>{
    private Map<Vertex<V>, List<Vertex<V>>> adjacencyList;

    public MyGraph(){
        adjacencyList = new HashMap<>(); // initializing hashmap
    }

    public void addVertex(Vertex<V> vertex){ // creating a new pair vertex and edges it is connected
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(){

    }

    public void printGraph(){

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
