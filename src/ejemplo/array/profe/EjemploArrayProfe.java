/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.array.profe;

/**
 *
 * @author FabricioArturo
 */
public class EjemploArrayProfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Este programa promedia las posiciones pares y suma las posiciones nones de un arreglo */
        int promedioPar,  sumaPar = 0, sumaNon = 0, cont = 0, cont2=0;
        int promedioNon;
        int [][] matrix = {{10, 30, 89, 48, 56 }, 
                            {32, 23, 84, 20, 10},
                            {72, 108, 71, 402,8}};
        
        
        //i inicia en 0, el ciclo se ejecuta mientras i < tamaño del arreglo 
        //y se incrementa de dos en dos.
        for (int i = 0; i < matrix.length ; i++) {
    
    for (int j = 0; j < matrix[i].length; j = j+2) {
    
    sumaPar = sumaPar + matrix[i][j];
    cont++;
    
   
    }
  } 
        
        promedioPar = sumaPar/cont;
        System.out.println(promedioPar);
        
        
        for (int i = 0; i < matrix.length; i++) {
        
        for (int j= 1; j < matrix[i].length; j=j+2 ) {
        
        sumaNon = sumaNon + matrix [i][j];
        cont2 ++;
        
        }
        
        
        }
       promedioNon = sumaNon / cont2;
        System.out.println(sumaNon);
        System.out.println("Promedio non es: "+ promedioNon);
        
    }
    
}
