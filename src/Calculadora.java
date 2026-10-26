import java.util.Scanner;

/**
 * Autor: Daniel Morgado Marquez
 */
public class Calculadora {

    static double sumar(double a, double b) {
        return a + b;
    }

    static double restar(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return a / b;
    }

    static void mostrarMenu() {
        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer numero: ");
                double a = sc.nextDouble();
                System.out.print("Segundo numero: ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + sumar(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + restar(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(a, b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + dividir(a, b));
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        System.out.println("Hasta pronto.");
        sc.close();
    }
}