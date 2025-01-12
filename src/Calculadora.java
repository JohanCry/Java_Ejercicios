import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Calculadora
        double num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cantidad para realizar las operaciones");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese otra cantidad");
        num2 = scanner.nextDouble();
        resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + resultado);
        resultado = num1 - num2;
        System.out.println("La resta de " + num1 + " - " + num2 + " es " + resultado);
        resultado = num1 * num2;
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + resultado);
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero");
        }
        else {
            if (num2>num1) {
                System.out.println("Error, No se puede dividir entre un número menor");
            }
                else{
                    resultado = num1 / num2;
                    System.out.println("La division de " + num1 + " / " + num2 + " es " + resultado);
                    resultado = num1 % num2;
                    System.out.println("El residuo de " + num1 + " % " + num2 + " es " + resultado);
                }
        }
        System.out.println("Muchas gracias por usar la calculadora");
    }
}