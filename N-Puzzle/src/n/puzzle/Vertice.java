package n.puzzle;

import java.util.ArrayList;

public class Vertice {
    
    public int indice;
    public int valor;
    public ArrayList<Vertice> listAdj;
    public int posX;
    public int posY;
    public int distM;
    
    Vertice(int indice, int valor, int x, int y){
        this.indice = indice;
        this.valor = valor;
        this.listAdj = new ArrayList();
        this.posX = x;
        this.posY = y;
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

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getDistM() {
        return distM;
    }

    public void setDistM(int distM) {
        this.distM = distM;
    }
    
    public void printarArestas(){
        System.out.print(this.valor + " -> ");
        for (Vertice vertice : listAdj){
            if (vertice.indice<listAdj.size()){
                System.out.print(vertice.getValor() + ", ");
            }
            else{
                System.out.println(vertice.getValor());
            }
        }
    }
    
    public void calculaDist(Vertice vertice){
        
    }
}
