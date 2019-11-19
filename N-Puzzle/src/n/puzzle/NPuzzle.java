
package n.puzzle;

import java.util.Scanner;

public class NPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        Grafo puzzle = new Grafo();
        for (int i=0; i<16; i++){
            puzzle.addVertice(i+1, buffer.nextInt(), (i/4), (i%4));
        }
        for (int i=0; i<16; i++){
            if (i>3){
                puzzle.vertices.get(i).addAresta(puzzle.vertices.get(i-4));
            }
            if (i!=0 || i%4!=0){
                puzzle.vertices.get(i).addAresta(puzzle.vertices.get(i-1));
            }
            if ((i+1)%4!=0){
                puzzle.vertices.get(i).addAresta(puzzle.vertices.get(i+1));
            }
            if (i<12){
                puzzle.vertices.get(i).addAresta(puzzle.vertices.get(i+4));
            }
        }
        System.out.println("\n --------------- Printando PUZZLE ---------------\n");
        puzzle.printarGrafo();
        System.out.println("\n --------------- Printando ARESTAS ---------------\n");
        for (Vertice vertice : puzzle.vertices){
            vertice.printarArestas();
        }
        
    }
    
}
