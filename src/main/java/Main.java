import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MutableGraph<String> graph = GraphBuilder.undirected().build();

        ArrayList<String> firstFlour = CreateNodeList(6, "B1");
        ArrayList<String> secondFlour = CreateNodeList(6, "B2");

        AddNodeInGraf(graph, firstFlour);
        AddNodeInGraf(graph, secondFlour);

        PutNodes(graph, firstFlour);
        PutNodes(graph, secondFlour);

        graph.putEdge(firstFlour.get(4), secondFlour.get(4));


        System.out.println(graph.edges());
    }

    private static ArrayList<String> CreateNodeList(int count, String mark) {
        ArrayList<String> nodes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            nodes.add(i + " " + mark);
        }
        return nodes;
    }

    private static void AddNodeInGraf(MutableGraph<String> graph, ArrayList<String> nodes) {
        nodes.forEach(o -> graph.addNode(o));
    }

    private static void PutNodes(MutableGraph<String> graph, ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            graph.putEdge(list.get(i), list.get(i + 1));
        }
    }
}


