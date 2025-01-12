import java.util.Scanner;

public class calculadora_pro {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String operador;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadoras And");
        System.out.println("Bienvenido ;D ");
        System.out.println("Ingrese el tipo de operación que desea realizar (+, -, *, /)");
        operador = scanner.nextLine();

        if (operador.equals("+")) {
            System.out.println("Realizaremos una suma");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operador.equals("-")) {
            System.out.println("Realizaremos una resta");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            while (num1 < num2) {
                System.out.println("El primer número debe ser mayor al segundo");
                System.out.println("Ingrese la primera cantidad");
                num1 = scanner.nextInt();
                System.out.println("Ingrese la segunda cantidad");
                num2 = scanner.nextInt();
            }
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operador.equals("*")) {
            System.out.println("Realizaremos una multiplicación");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (operador.equals("/")) {
            System.out.println("Realizaremos una división");
            System.out.println("Ingrese la primera cantidad");
            num1 = scanner.nextInt();
            System.out.println("Ingrese la segunda cantidad");
            num2 = scanner.nextInt();
            while (num2 == 0) {
                System.out.println("No se puede dividir entre 0");
                System.out.println("Ingrese la segunda cantidad");
                num2 = scanner.nextInt();
            }
            while (num1 < num2) {
                System.out.println("El primer número debe ser mayor al segundo");
                System.out.println("Ingrese la primera cantidad");
                num1 = scanner.nextInt();
                System.out.println("Ingrese la segunda cantidad");
                num2 = scanner.nextInt();
            }
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            resultado = num1 % num2;
            System.out.println("El residuo de la división es: " + resultado);
        }
    }
}