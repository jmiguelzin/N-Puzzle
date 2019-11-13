package n.puzzle;

import java.util.ArrayList;

public class Vertice {
    
    public int valor;
    public ArrayList<Vertice> listAdj;
    
    Vertice(int valor){
        this.valor = valor;
        this.listAdj = new ArrayList();
    }
    
    public void addAresta(Vertice adj){
        
        listAdj.add(adj);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Vertice> getListAdj() {
        return listAdj;
    }

    public void setListAdj(ArrayList<Vertice> listAdj) {
        this.listAdj = listAdj;
    }
    
    public void printarArestas(){
        int i = 0;
        System.out.print(this.valor + " -> ");
        for (Vertice vertice : listAdj){
            if (i<listAdj.size()-1){
                System.out.print(vertice.getValor() + ", ");
            }
            else{
                System.out.println(vertice.getValor());
            }
            i++;
        }
    }
}
