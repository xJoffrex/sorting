public class Seleccion {

    public static int[] ordenar(int[] arreglo, boolean mostrarPasos, String ordenamiento) {
        int longitudArreglo = arreglo.length;
        int contadorComparaciones = 0;
        int contadorIntercambios = 0;
        int[] resultados = new int[2];

        if (mostrarPasos) {

            System.out.println("Metodo Seleccion");
            System.out.print("Arreglo original: ");
            imprimirArregloCompleto(arreglo);
            
        }

        for (int indiceExterno = 0; indiceExterno < longitudArreglo - 1; indiceExterno = indiceExterno + 1) {
            int indiceValorMinimo = indiceExterno;

            for (int indiceInterno = indiceExterno + 1; indiceInterno < longitudArreglo; indiceInterno = indiceInterno + 1) {
                contadorComparaciones = contadorComparaciones + 1;

                if ((ordenamiento.equals("A") && arreglo[indiceInterno] < arreglo[indiceValorMinimo]) ||(ordenamiento.equals("D") && arreglo[indiceInterno] > arreglo[indiceValorMinimo])) {

                    if (mostrarPasos) {
                        System.out.println("Comparacion " + contadorComparaciones + ": " +arreglo[indiceInterno] + " " + (ordenamiento.equals("A") ? "<" : ">") + " " + arreglo[indiceValorMinimo]);
                    }

                    indiceValorMinimo = indiceInterno;
                }
            }

            if (indiceExterno != indiceValorMinimo) {
                contadorIntercambios = contadorIntercambios + 1;
                int temp = arreglo[indiceValorMinimo];
                arreglo[indiceValorMinimo] = arreglo[indiceExterno];
                arreglo[indiceExterno] = temp;

                if (mostrarPasos) {
                    System.out.println("Intercambio: " + arreglo[indiceExterno] + " <-> " + arreglo[indiceValorMinimo]);
                    imprimirArregloCompleto(arreglo);
                }
            }
        }

        System.out.print("Arreglo: ");
        imprimirArregloCompleto(arreglo);
        System.out.println("Comparaciones realizadas: " + contadorComparaciones);
        System.out.println("Total intercambios: " + contadorIntercambios);

        resultados[0] = contadorComparaciones;
        resultados[1] = contadorIntercambios;
        return resultados;
    }

    private static void imprimirArregloCompleto(int[] arregloNumeros) {
        for (int i = 0; i < arregloNumeros.length; i = i + 1) {
            System.out.print(arregloNumeros[i] + " ");
        }
        System.out.println();
    }
}