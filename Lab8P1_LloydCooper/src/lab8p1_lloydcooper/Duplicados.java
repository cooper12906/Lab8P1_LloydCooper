package lab8p1_lloydcooper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Duplicados {
    private int[] numeros;
    
    public Duplicados(int tam) {
        numeros = new int[tam];
    }
    
    public void llenarArreglo() {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }
        
    }
    
    public void eliminarDuplicados() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[j] = 0;
                }
            }
        }
        imprimirArreglo();
    }
    
    public void imprimirArreglo() {
        System.out.println(Arrays.toString(numeros));
    }
    
}