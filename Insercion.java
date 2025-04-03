public class Insercion {

    public static int[] ordenar(int[] arr, boolean mostrarPasos, String orden) {
        int n = arr.length;
        int comps = 0;
        int inters = 0;
        int[] resultados = new int[2];

        if (mostrarPasos) {
            System.out.println("Metodo Insercion");
            System.out.print("Arreglo original: ");
            imprimir(arr);
        }

        for (int i = 1; i < n; i = i + 1) {

            int valorAInsertar = arr[i];
            int j = i - 1;

            while (j >= 0 && ((orden.equals("A") && arr[j] > valorAInsertar) || (orden.equals("D") && arr[j] < valorAInsertar))) {

                comps = comps + 1;
                inters = inters + 1;

                if (mostrarPasos) {

                    System.out.println("Comp " + comps + ": " + arr[j] + " " + (orden.equals("A") ? ">" : "<") + " " + valorAInsertar);
                }

                arr[j + 1] = arr[j];

                if (mostrarPasos) {

                    System.out.println("Moviendo: " + arr[j] + " a la pos " + (j + 1));
                    imprimir(arr);
                }

                j = j - 1;
            }

            if (j >= 0) {
                
                comps = comps + 1;
            }

            arr[j + 1] = valorAInsertar;

            if (mostrarPasos && j + 1 != i) {
                System.out.println("Insertando " + valorAInsertar + " en la pos " + (j + 1));
                imprimir(arr);
            }
        }

        System.out.print("Arreglo: ");
        imprimir(arr);
        System.out.println("Comparaciones: " + comps);
        System.out.println("Intercambios: " + inters);

        resultados[0] = comps;
        resultados[1] = inters;
        return resultados;
    }

    private static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
