package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //IMPRESSÃO NA TELA PRO USUARIO INSERIR A QUANTIDADE DE LINHAS E COLUNAS DE UMA MATRIZ
        System.out.println("Enter two integer numbers for the row and column of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        //IMPRESSÃO NA TELA PARA INSERIR OS ELEMENTOS DA MATRIZ
        System.out.println("Enter the matrix elements: ");

        //INSTANCIAÇÃO DA MATRIZ NA MEMÓRIA
        int[][] matrix = new int[m][n];

        //PREENCHIMENTO DE TODOS OS ELEMENTOS DA MATRIZ PELO USUÁRIO
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //IMPRESSÃO NA TELA PRO USUARIO INSERIR O NUMERO E AS OCORRÊNCIAS
        System.out.println("Enter a number from the matrix to check occurrences: ");
        int numberToCheck = sc.nextInt();
        sc.nextLine();

        // PERCORRE TODA A MATRIZ PARA VERIFICAR AS OCORRENCIAS DE ACORDO COM O NÚMERO INSERIDO PELO USUÁRIO
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberToCheck) {
                    System.out.println("Position " + i + "," + j + ":");

                    //VERIFICA E IMPRIME OS ELEMENTOS A ESQUERDA, ACIMA, DIREITA ABAIXO DA OCORRENCIA
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}