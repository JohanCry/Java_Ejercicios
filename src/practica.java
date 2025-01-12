import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        //variables
        int num1, num2, resultado;
        int operador;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Ingrese numero (1) para realizar una suma");
        operador = scanner.nextInt();
        //suma
        if (operador == 1) {
            System.out.println("Ingrese 2 números para realizar la suma");
            System.out.println("Primer número");
            num1 = scanner.nextInt();
            System.out.println("Segundo número");
            num2 = scanner.nextInt();
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        }
        else {
            System.out.println("eres estupido amigo");
        }
    }
}
