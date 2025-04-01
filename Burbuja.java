public class Burbuja {

    public static int[] ordenar(int[] arreglo, boolean mostrarPasos, String orden) {
        int n = arreglo.length;
        int comparaciones = 0;
        int intercambios = 0;
        int[] resultados = new int[2];

        if (mostrarPasos) {
            System.out.println("Metodo Burbuja");
            System.out.print("Arreglo original: ");
            imprimirArreglo(arreglo);
        }

        for (int i = 0; i < n - 1; i = i + 1) {
            for (int j = 0; j < n - 1 - i; j = j + 1) {
                comparaciones = comparaciones + 1;
                if ((orden.equals("A") && arreglo[j] > arreglo[j + 1]) || (orden.equals("D") && arreglo[j] < arreglo[j + 1])) {
                    intercambios = intercambios + 1;
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    if (mostrarPasos) {
                        System.out.println("Comparacion " + comparaciones + ": " + arreglo[j] + " " + (orden.equals("A") ? ">" : "<") + " " + arreglo[j + 1]);
                        System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                        imprimirArreglo(arreglo);
                    }
                }
            }
        }

        System.out.print("Arreglo: ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones realizadas: " + comparaciones);
        System.out.println("Total intercambios: " + intercambios);

        resultados[0] = comparaciones;
        resultados[1] = intercambios;
        return resultados;
    }

    private static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}