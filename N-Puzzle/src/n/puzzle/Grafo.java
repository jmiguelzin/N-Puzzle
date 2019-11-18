
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
    
    public void addVertice(int valor, int x, int y){
        this.vertices.add(new Vertice(valor, x, y));
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
    
    public int heuristic1(){
        int resultado = 0;
        int i = 1;
        for (Vertice vertice : vertices){
            if (i == 16){
                i=0;
            }
            if (vertice.getValor() != i){
                resultado++;
            }
            i++;
        }
        
        return resultado;
    }
    
    public int heuristic2(){
        int resultado = 0;
        boolean first = true;
        Vertice anterior = null;
        
        for (Vertice vertice : vertices){
            if (first == false){
                if (vertice.getValor() != anterior.getValor() + 1){
                    resultado++;
                }
            }
            else{
                first = false;
            }
            anterior = vertice;
        }
        
        return resultado;
    }
}


