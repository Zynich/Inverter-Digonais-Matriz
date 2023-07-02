public class MatrizQuadrada {

    public static void inverterDiagonais(int[][] matriz) {
        int tamanho = matriz.length;

        // Inverte a primeira diagonal
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[tamanho - 1 - i][tamanho - 1 - i];
            matriz[tamanho - 1 - i][tamanho - 1 - i] = temp;
        }

        // Inverte a segunda diagonal
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = matriz[tamanho - 1 - i][i];
            matriz[tamanho - 1 - i][i] = temp;
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

}
