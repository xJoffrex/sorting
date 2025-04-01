import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        Scanner Scanner = new Scanner(System.in);
        int[] Arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48};
        boolean Menu = false;

        while (Menu == false) {

            System.out.println("Selecione Una Opcion: ");
            System.out.println("1. Burbuja");
            System.out.println("2. Seleccion");
            System.out.println("3. Insercion");
            System.out.println("4. Burbuja Mejorada");
            System.out.println("5. Salir");
            int Opcion = Scanner.nextInt();

            boolean MostrarPasos;
            String Orden;
            int[] resultados; // almacenamiento

            switch (Opcion) {

                case 1:

                    System.out.println("Desea Ver Los Pasos? True/False: ");
                    MostrarPasos = Scanner.nextBoolean();

                    System.out.println("Orden Ascendente O Descendente A/D: ");
                    Orden = Scanner.next().toUpperCase();

                    if (!Orden.equals("A") && !Orden.equals("D")) {
                        System.out.println("Entrada no valida");
                        return;
                    }

              
                    resultados = Burbuja.ordenar(Arreglo, MostrarPasos, Orden);
                    System.out.println("Comparaciones: " + resultados[0]);
                    System.out.println("Intercambios: " + resultados[1]);
                    break;

                case 2:

                    System.out.println("Desea Ver Los Pasos? True/False: ");
                    MostrarPasos = Scanner.nextBoolean();

                    System.out.println("Orden Ascendente O Descendente A/D: ");
                    Orden = Scanner.next().toUpperCase();

                    if (!Orden.equals("A") && !Orden.equals("D")) {
                        System.out.println("Entrada no valida");
                        return;
                    }

               
                    resultados = Seleccion.ordenar(Arreglo, MostrarPasos, Orden);
                    System.out.println("Comparaciones: " + resultados[0]);
                    System.out.println("Intercambios: " + resultados[1]);
                    break;

                case 3:

                    System.out.println("Desea Ver Los Pasos? True/False: ");
                    MostrarPasos = Scanner.nextBoolean();

                    System.out.println("Orden Ascendente O Descendente A/D: ");
                    Orden = Scanner.next().toUpperCase();

                    if (!Orden.equals("A") && !Orden.equals("D")) {
                        System.out.println("Entrada no valida");
                        return;
                    }

             
                    resultados = Insercion.ordenar(Arreglo, MostrarPasos, Orden);
                    System.out.println("Comparaciones: " + resultados[0]);
                    System.out.println("Intercambios: " + resultados[1]);
                    break;

                case 4:

                    System.out.println("Desea Ver Los Pasos? True/False: ");
                    MostrarPasos = Scanner.nextBoolean();

                    System.out.println("Orden Ascendente O Descendente A/D: ");
                    Orden = Scanner.next().toUpperCase();

                    if (!Orden.equals("A") && !Orden.equals("D")) {
                        System.out.println("Entrada no valida");
                        return;
                    }

                  
                    resultados = Burbuja_Mejorada.ordenar(Arreglo, MostrarPasos, Orden);
                    System.out.println("Comparaciones: " + resultados[0]);
                    System.out.println("Intercambios: " + resultados[1]);
                    break;

                case 5:
                    Menu = true;
                    break;

                default:
                    System.out.println("No Es Valido");
                    return;
            }
            Arreglo = new int[]{12, -7, 25, 0, -15, 33, 19, -22, 5, 48}; //reinicio la lista 
        }
        Scanner.close();
    }

    public static void imprimirArreglo(int[] Arreglo) {
        for (int Num : Arreglo) {
            System.out.print(Num + " ");
        }
        System.out.println();
    }
}