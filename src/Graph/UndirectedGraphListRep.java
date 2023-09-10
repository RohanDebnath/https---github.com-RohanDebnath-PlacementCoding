import java.util.LinkedList;

public class UndirectedGraphListRep {
    LinkedList<Integer>[] adj;
    int V;
    int E;

    public UndirectedGraphListRep(int node) {
        this.V = node;
        this.E = 0;
        this.adj = new LinkedList[node]; // Array of LinkedList ta akhane toiri holo

        for (int i = 0; i < V; i++) { // Sobar jonno seperate LinkedList toiri korbo
            adj[i] = new LinkedList<>(); // Ata te value gulo store thakbe
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices " + E + " Edges" + "\n\n");
        for (int i = 0; i < adj.length; i++) {
            sb.append("Vertex " + i + ": ");
            for (int j = 0; j < adj[i].size(); j++) {
                sb.append(adj[i].get(j) + " "); // Bar bar bhul hocchilo 22 August
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        UndirectedGraphListRep g = new UndirectedGraphListRep(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g.display());
    }
}
