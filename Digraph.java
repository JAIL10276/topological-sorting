import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Digraph<V> {
    private Map<V,  ArrayList<V> > neighbors = new HashMap<>();

    public Digraph() {

    }
    public void add(V v) {
        neighbors.put(v, new ArrayList<>());
    }
    public ArrayList<V> neighbors(V source) {
        if (neighbors().containsKey(Source)){
            return neighbors.get(source);
        }
        // return neighbors.getOrDefault(source, new ArrayList<>();
    }
    public Set<V> vertices() {
        return neighbors.keySet();
    }
    public boolean contains(V vtx) {
        return neighbors().containsKey(vtx);
    }
    public void add(V src, V dest) {
        if (neighbors.containKey(src)){
            ArrayList<V> neighbors
        }
    }

}
