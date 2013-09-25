package tamo.quase;

/**
*
* @author wins
*/
public class MatrixInt {
   
   // cria uma matriz de inteiros, sem inicializa��o dos elementos e retorna a matriz criada
   public static int[][] newEmptyMatrix(int cols, int rows){
       int[][] matriz = new int[rows][cols];
       return matriz;
   }
   
   // cria um Matrix de inteiros, inicializando os elementos com n�meros aleat�rios e retorna o 
   //matriz criada. N�o esque�a da regra dos n�meros aleat�rios: de [0..99]!
   public static int[][] newRandomMatrix(int cols, int rows){
   
       int[][] matriz  = MatrixInt.newEmptyMatrix(cols, rows);
       
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] = (int) (Math.random() * 100);
           }
       }
       
       return matriz;
       
   }
   
   // cria um Matrix de inteiros, inicializando os elementos com n�meros sequenciais (matriz[0][0]=0, matriz[0][1]=1, matriz[1][0] = 10, matriz[4][2] = 42...) e retorna o matriz criada
   public static int[][] newSequentialMatrix(int cols, int rows){
       
       int[][] matriz  = MatrixInt.newEmptyMatrix(cols, rows);
       String valor;
       
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               valor =  String.valueOf(i) + String.valueOf(j);
                matriz[i][j] = Integer.parseInt(valor);
           }
       }
       
       return matriz;
   
   }
   
   // inverte o matriz! Assim, o primeiro elemento ser� invertido com o �ltimo, o segundo com o 
   //pen�ltimo, ...
   public static void revert(int matriz[][]){
       int metade,q,num;
   
       for (int i = 0; i < matriz.length; i++) {
           metade = ((int) (matriz[i].length/2));
           
           for (int j = 0; j < metade; j++) {
               q = (matriz[i].length - 1) - j;
               num = matriz[i][j];
               matriz[i][j] = matriz[i][q];
               matriz[i][q] = num;
               
           }
           
       }
       
   }
   
   // procura por um valor dentro da matriz, trocando ele por um outro valor e retorna o n�mero 
   //de trocas realizadas.
   public static int replace(int matriz[][], int oldvalue, int newvalue){
       int vezes = 0;
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               if (matriz[i][j] == oldvalue){
                   matriz[i][j] = newvalue;
                   vezes++;
               }
           }
       }
       
       return vezes;
       
   } 
   
   public static void imprimir(int matriz[][]){
   
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               System.out.print(matriz[i][j]);
               System.out.print(" ");
           }
           System.out.println(" ");
       }
   
   }
   
   
   
}

