import java.util.Scanner;

public class Centinela {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String operador;
        boolean centinela = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadoras And");
        System.out.println("Bienvenido ;D ");
        System.out.println("Ingrese el tipo de operación que desea realizar (+, -, *, /)");
        operador = scanner.nextLine();

        if (operador.equals("+")) {
            System.out.println("Realizaremos una suma\n");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operador.equals("-")) {
            System.out.println("Realizaremos una resta\n");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            while (centinela == true) {
                if (num1 <num2) {
                    System.out.println("El primer número debe ser mayor al segundo");
                    System.out.println("Vamos de nuevo\n");
                    System.out.println("Ingrese la primera cantidad");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese la segunda cantidad");
                    num2 = scanner.nextInt();
                }
                else {
                    centinela = false;
                }
            }
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operador.equals("*")) {
            System.out.println("Realizaremos una multiplicación\n");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (operador.equals("/")) {
            System.out.println("Realizaremos una división\n");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            while (centinela == true) {
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                    System.out.println("Vamos de nuevo\n");
                    System.out.println("Ingrese la primera cantidad");
                    System.out.println("Ingrese la segunda cantidad");
                    num2 = scanner.nextInt();
                }
                else {
                    centinela = false;
                }
            }
            while (centinela == true) {
                if (num1 < num2) {
                    System.out.println("El primer número debe ser mayor al segundo");
                    System.out.println("Ingrese la primera cantidad");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese la segunda cantidad");
                    num2 = scanner.nextInt();
                }
                else {
                    centinela = false;
                }
            }
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            resultado = num1 % num2;
            System.out.println("El residuo de la división es: " + resultado);
        }
        else {
            System.out.println("Operador no valido");
        }
        System.out.println("Muchas gracias por usar la calculadora");
    }
}