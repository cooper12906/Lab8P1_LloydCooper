package lab8p1_lloydcooper;

public class XArray {
    private int[][] matriz;
    private int[] diagonales;

    public XArray(int n) {
        matriz = new int[n][n];
        diagonales = new int[n * 2 - n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * (4100 - 1100 + 1) + 1100);
            }
        }
        //imprimir
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void sacarDiagonales() {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonales[contador] = matriz[i][j];
                    contador++;
                }
            }
        }
    }

    public int[] getDiagonales() {
        return diagonales;
    }
}






