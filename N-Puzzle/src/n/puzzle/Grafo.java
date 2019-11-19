
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
    
    public void addVertice(int indice, int valor, int x, int y){
        this.vertices.add(new Vertice(indice, valor, x, y));
    }

    public Grafo() {
        this.vertices = new ArrayList();
    }
    
    public void printarGrafo(){
        vertices.forEach((vertice) -> {
            if (vertice.indice%4!=0){
                System.out.print(vertice.getValor() + " - ");
            }
            else{
                System.out.println(vertice.getValor());
            }
        });
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
                if (vertice.getValor() != anterior.getValor() + 1 && anterior.getValor() != 0){
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
    
    public int calculaDist(int x1, int y1, int x2, int y2){
        
        return Math.abs(x1-x2) + Math.abs(y1-y2);
        
    }
    
    public int heuristic3(Vertice origem){
        
        Vertice destino;
        if (origem.valor != 0){
            destino = vertices.get(origem.valor-1);
        }
        else{
            destino = vertices.get(15);
        }
        
        return calculaDist(origem.getPosX(), origem.getPosY(), destino.getPosX(), destino.getPosY());
    }
}


