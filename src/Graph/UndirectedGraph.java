public class UndirectedGraph {
    private int V;
    private int e;
    private int adjMatrix[][];

    public UndirectedGraph(int node)
    {
        this.V=node;
        this.e=0;
        this.adjMatrix= new int[node][node];
    }
    public void addEdge(int u, int v)
    {
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        e++;
    }
    public String display()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V+" Vertices " +e+" Edges"+"\n\n" );
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                sb.append(adjMatrix[i][j]+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        UndirectedGraph g = new UndirectedGraph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g.display());
    }    
}
