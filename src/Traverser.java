import java.util.ArrayList;

public class Traverser {
    public static void depthFirstTraversel(Vertex start, ArrayList<Vertex> visited ){
        System.out.println(start.getData());
        for (Edge e:start.getEdges()) {
            Vertex neighbor=e.getEnd();

            if (!visited.contains(neighbor)){
               visited.add(neighbor);
               Traverser.depthFirstTraversel(neighbor,visited);
            }
        }
    }
}
