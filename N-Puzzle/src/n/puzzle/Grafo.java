
package n.puzzle;

import java.util.ArrayList;

public class Grafo {
    
    public ArrayList<Vertice> vertices;

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }
    
    public void addVertice(int valor){
        this.vertices.add(new Vertice(valor));
    }

    public Grafo() {
        this.vertices = new ArrayList();
    }
   
    public void printarGrafo(){
        int i = 1;
        for (Vertice vertice : vertices){
            if (i%4!=0){
                System.out.print(vertice.getValor() + " - ");
            }
            else{
                System.out.println(vertice.getValor());
            }
            i++;
        }
    }
}


