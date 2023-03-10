package lab8p1_lloydcooper;

import java.util.Random;
import java.util.*;

public class Lab8P1_LloydCooper {
    
    public static void main(String[] args) {
       char resp = 's';
       Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Generar matriz y mostrar diagonales");
            System.out.println("2. Sin duplicados ");
            System.out.println("3. Oración a Matriz ");
            System.out.println("4. Salida ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un tamaño para la matriz:");
                    int t = scanner.nextInt();
                    int[][] matriz = generarMatriz1(t);
                    XArray xArray = new XArray(t);
                    xArray.sacarDiagonales();
                    int[] diagonales = xArray.getDiagonales();
                   // System.out.println("Matriz generada:");
                   // imprimirMatriz1(matriz);
                    System.out.println("Arreglo de diagonales:");
                    imprimirArreglo(diagonales);
                    break;
                case 2:
                    int tam;
                    do {
                        System.out.print("Ingrese un tamaño entre 5 y 10: ");
                        tam = scanner.nextInt();
                    } while (tam < 5 || tam > 10);

                    Duplicados duplicados = new Duplicados(tam);
                    duplicados.llenarArreglo();
                    System.out.print("Arreglo generado: ");
                    duplicados.imprimirArreglo();
                    
                    System.out.print("Arreglo sin duplicados: ");
                    duplicados.eliminarDuplicados();
                    //duplicados.imprimirArreglo();
                    break;
                
                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Ingrese una oración: ");
                    String oracion = sc.nextLine();
                    OMatriz m = new OMatriz(oracion);
                    char[][] matrizResultante = m.getm();
                    for (int i = 0; i < matrizResultante.length; i++) {
                        for (int j = 0; j < matrizResultante[i].length; j++) {
                            if (matrizResultante[i][j] != '-') {
                                System.out.print("[" + matrizResultante[i][j] + "]");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
 
        System.out.println("Desea continuar? [s/n]");
        resp = scanner.next().charAt(0);
       } while (resp == 's' || resp == 'S');   
    }
    
    public static int[][] generarMatriz1(int tamano) {
        int[][] matriz = new int[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = (int) (Math.random() * (4100 - 1100 + 1) + 1100);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz1(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
    

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }
}