package tamo.quase;

import javax.swing.JOptionPane;

/**
 *
 * @author wins
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    System.out.print(matriz[i][j]);
                    System.out.print(" "); 
                }else{
                    System.out.print(" "+matriz[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    
    public static void imprimir2(int matriz[][]){
        String linha = "";
        for (int i = 0; i < matriz[0].length; i++) {
            linha += "+--";
            if (i == (matriz[0].length - 1)) {
                linha += "+";
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(linha);
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    System.out.print(matriz[i][j]);
                    System.out.print("|"); 
                }else{
                    System.out.print(" "+matriz[i][j]);
                    System.out.print("|");
                }
            }
            System.out.println(" ");
            if (i == (matriz.length - 1)) {
                System.out.println(linha);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int cols1, cols2, rows1, rows2, num_usu1, num_usu2;
        
        try{
            
            cols1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de colunas para a primeira matriz:"));
            rows1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de linhas para a primeira matriz:"));
            cols2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de colunas para a segunda matriz:"));
            rows2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de linhas para a segunda matriz:"));
            
            int[][] matriz1 = MatrixInt.newRandomMatrix(cols1, rows1);
            int[][] matriz2 = MatrixInt.newSequentialMatrix(cols2, rows2);
            
            System.out.println("Primeira matriz:");
            MatrixInt.imprimir(matriz1);
            System.out.println(" ");
            System.out.println("Segunda matriz:");
            MatrixInt.imprimir(matriz2);
            System.out.println(" ");
            
            MatrixInt.revert(matriz2);
            
            System.out.println("Matriz sequancial invertida:");
            MatrixInt.imprimir(matriz2);
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Matriz aleatoria:");
            MatrixInt.imprimir(matriz1);
            System.out.println(" ");
            
            num_usu1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero qualquer:"));
            
            for1: for (int i = 0; i < matriz1.length; i++) {
                   for (int j = 0; j < matriz1[i].length; j++) {
                    if(num_usu1 == matriz1[i][j]){
                            System.out.println("O numero '"+num_usu1+"' foi encontardo na posição:" + i);
                            break for1;
                        }else if(j == (matriz1[i].length - 1) && i == (matriz1.length - 1)){
                            System.out.println("Não foi encontrado o numero '"+num_usu1+"' no vetor aleatorio.");
                            break for1;
                        }   
                    }
                }
            
             String menores = "", maiores = "";
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[i].length; j++) {
                         if(num_usu1 > matriz1[i][j]){
                            menores = menores + matriz1[i][j] + ", ";
                        }else if(num_usu1 < matriz1[i][j]){
                            maiores = maiores + matriz1[i][j] + ", ";
                        }
                    }
                }
             System.out.println(" ");
             System.out.print("Numeros menores que '"+num_usu1+"' :");
             System.out.println(menores);
             System.out.print("Numeros maiores que '"+num_usu1+"' :");
             System.out.println(maiores);
                
             num_usu2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero que exista na matriz aleatoria:"));
             
             int trocas = MatrixInt.replace(matriz1, num_usu2, num_usu1);
             
             if (trocas == 0) {
                 System.out.println(" ");
                 System.out.println("Não foi realizada nenhuma troca de valores.");
             }else{
                 System.out.println(" ");
                 System.out.println("O numero de trocas realizadas foi: "+trocas);
             }
             
             System.out.println(" ");
             System.out.println("Matriz aleatoria:");
             MatrixInt.imprimir(matriz1);
             
             int soma_total = 0;
             for (int i = 0; i < matriz1.length; i++) {
                 for (int j = 0; j < matriz1[i].length; j++) {
                     soma_total += matriz1[i][j];
                 }
                
            }
             System.out.println(" ");
             System.out.println("A soma dos numeros da matriz foi: " + soma_total);
             
             System.out.println(" ");
             System.out.println("Matriz aleatoria");
             Exercicio2.imprimir(matriz1);
             System.out.println(" ");
             System.out.println("Matriz sequencial");
             Exercicio2.imprimir2(matriz2);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
}
