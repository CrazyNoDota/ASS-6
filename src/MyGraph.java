import java.util.ArrayList;
import java.util.List;

public class MyGraph<V>{
    private ArrayList<Vertex> vertices;

    public MyGraph(){
        vertices = new ArrayList<Vertex>(); // initializing hashmap
    }

    public void addVertex(Vertex<V> vertex){ // creating a new pair vertex and edges it is connected
        vertices.add(vertex);
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight){
        for(Vertex vertex: vertices){
            if(vertex.equals(source)){
                vertex.addAdjacentVertex(destination, weight);
            }
        }
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
