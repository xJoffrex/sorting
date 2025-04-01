public class Burbuja_Mejorada {

    public static int[] ordenar(int[] arreglo, boolean mostrarPasos, String orden) {
        int n = arreglo.length;
        boolean cambio;
        int comparaciones = 0;
        int intercambios = 0;
        int[] resultados = new int[2];

        if (mostrarPasos) {
            System.out.println("Metodo Burbuja Mejorada");
            System.out.print("Arreglo original: ");
            imprimirArreglo(arreglo);
        }

        for (int pasada = 0; pasada < n - 1; pasada = pasada + 1) {
            cambio = false;

            for (int comparacion = 0; comparacion < n - 1 - pasada; comparacion = comparacion + 1) {
                comparaciones = comparaciones + 1;

                if ((orden.equals("A") && arreglo[comparacion] > arreglo[comparacion + 1]) || (orden.equals("D") && arreglo[comparacion] < arreglo[comparacion + 1])) {

                    intercambios = intercambios + 1;

                    int temporal         = arreglo[comparacion];
                    arreglo[comparacion] = arreglo[comparacion + 1];
                    arreglo[comparacion + 1] = temporal;
                    cambio = true;

                    if (mostrarPasos) {
                        System.out.println("Comparacion " + comparaciones + ": " + arreglo[comparacion + 1] + " " + (orden.equals("A") ? "<" : ">") + " " + arreglo[comparacion]);
                        System.out.println("Intercambio: " + arreglo[comparacion] + " <-> " + arreglo[comparacion + 1]);
                        imprimirArreglo(arreglo);
                    }
                }
            }

            if (!cambio) {
                if (mostrarPasos) {
                    System.out.println("Ordenado");
                }
                break;
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
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}