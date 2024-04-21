package ArrayLaberinto;

import java.util.ArrayDeque;
import java.util.Deque;

public class Laberinto {
    private int[][] tablero;
    private int filas;
    private int columnas;

    public Laberinto(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero = new int[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        // Llenar el borde con unos (paredes)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || j == 0 || i == filas - 1 || j == columnas - 1) {
                    tablero[i][j] = 1; // Pared
                } else {
                    tablero[i][j] = Math.random() * 10 > 6 ? 1 : 0; // Espacio disponible
                }
            }
        }
    }

    public void imprimirLaberinto() {
        tablero[1][0]= 7;
        tablero[tablero.length-2][tablero[0].length-1]= 7;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public boolean hayCamino(){
        
        return hayCaminoDesdePrincipio();
        
    }
    
    private boolean hayCaminoDesdePrincipio() {
        Deque<int[]> pila = new ArrayDeque<>();
        pila.push(new int [] {1,0});
        
        while(!pila.isEmpty()){
            int[] actual = pila.pop();
            int i = actual[0];
            int j = actual[1];
            
            if (i < 0 || i > tablero.length-1 || j < 0 ||
                    j > tablero[0].length-1 || tablero[i][j] == 1 ||
                    tablero[i][j] == -1) {
                continue;
                
            }
            
            if (tablero[i][j] == 7 && (i !=1)) {
                return true;
            }
            
            tablero[i][j] = -1;
            
            pila.push(new int [] {i, j + 1});   //derecha
            pila.push(new int [] {i, j - 1});   //izquierda
            pila.push(new int [] {i + 1, j});   //abajo
            pila.push(new int [] {i -1, j});    //arriba
            pila.push(new int [] {i + 1, j + 1});
            pila.push(new int [] {i - 1, j + 1});
            pila.push(new int [] {i - 1, j - 1});
            pila.push(new int [] {i + 1, j - 1});
            
        }
        return false;
        
//        if (i < 0 || i >= tablero.length || j < 0 || j >= tablero[0].length){
//            return false;
//        }
//        
//        if (tablero[i][j] == 7 && (i != 1 || j != 0)) {
//            return true;
//        }
//        
//        if (tablero [i][j] == 1) {
//            return false;
//        }
//        
//        tablero [i][j] = -1;
//        
//        boolean hayCamino =  hayCaminoDesdePrincipio(i , j + 1) ||
//                             hayCaminoDesdePrincipio(i, j-1) ||
//                             hayCaminoDesdePrincipio(i + 1, j) ||
//                             hayCaminoDesdePrincipio(i - 1, j);
//        
//        tablero [i][j] = 0;
//        
//        return hayCamino;
//        
    }

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        Laberinto laberinto = new Laberinto(filas, columnas);
        laberinto.imprimirLaberinto();
        
        if (!laberinto.hayCamino()) {
            System.out.println("No hay camino");
        }else{
            System.out.println("Si hay camino");
        }
        
    }

    
}

