import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            double num1 = 0, num2 = 0;
            String operacion;
            boolean entradaValida = false;

            System.out.println("==Calculadora==");

            while (!entradaValida) {
                try {
                    System.out.println("Ingrese el primer numero: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida. Ingrese un numero valido");
                }
            }

            entradaValida = false;

            while (!entradaValida) {
                try {
                    System.out.println("Ingrese el segundo numero");
                    num2 = Double.parseDouble(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida. Ingrese un valor valido");
                }
            }

            System.out.println("Ingrese la operacion (+,-,*,/): ");
            operacion = scanner.nextLine();

            switch (operacion) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir por cero");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Operacion no valida.");
            }

            while (true) {
                System.out.println("¿Desea realizar otra operacion? (si/no): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("no") || respuesta.equals("n")) {
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora");
                    break;
                } else if (respuesta.equals("si") || respuesta.equals("sí") || respuesta.equals("s")) {
                    break;
                } else {
                    System.out.println("Respuesta no valida");
                }
            }
        }
        scanner.close();
    }
}
