import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Calculadora pro 2.0
        char signo;
        double num1, num2, resultado;
        Scanner input =  new Scanner(System.in);
        System.out.println("Calculadoras and 2.0 pro mejorada");
        System.out.println("Ingrese el signo de la operación que desea realizar (+, -, *, /)");
        signo = input.next().charAt(0);

        switch (signo) {
            case '+':
                System.out.println("Realizaremos una suma\n");
                System.out.println("Ingrese la primera cantidad");
                num1 = input.nextDouble();
                System.out.println("Ingrese la segunda cantidad");
                num2 = input.nextDouble();
                resultado = num1 + num2;
                System.out.println("El resultado de la suma de: " + num1 + "+ " + num2 + "es: " + resultado);
                break;
            case '-':
                System.out.println("Realizaremos una resta\n");
                System.out.println("Ingrese la primera cantidad");
                num1 = input.nextDouble();
                System.out.println("Ingrese la segunda cantidad");
                num2 = input.nextDouble();
                while (num1 < num2) {
                    System.out.println("El primer numero debe ser mayor al segundo");
                    System.out.println("Vamos de nuevo\n");
                    System.out.println("Ingrese la primera cantidad");
                    num1 = input.nextDouble();
                    System.out.println("ingrese la segunda cantidad");
                    num2 = input.nextDouble();
                }
                resultado = num1 - num2;
                System.out.println("El resultado de la resta de: " + num1 + "+ " + num2 + "es: " + resultado );
                break;
            case '*':
                System.out.println("Realizaremos una multiplicación\n");
                System.out.println("Ingrese la primera canitdad");
                num1 = input.nextDouble();
                System.out.println("Ingrese la segunda cantidad");
                num2 = input.nextDouble();
                resultado = num1 * num2;
                System.out.println("El producto de: " + num1 + "* " + num2 + "es: " + resultado);
                break;
            case '/':
                System.out.println("Realizaremos una división\n");
                System.out.println("Ingrese la primera cantidad");
                num1 = input.nextDouble();
                System.out.println("Ingrese la segunda cantidad");
                num2 = input.nextDouble();
                while (num2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                    System.out.println("Vamos de nuevo\n");
                    System.out.println("Ingrese la primera cantidad");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese la segunda cantidad");
                    num2 = input.nextDouble();
                }
                while (num1 < num2) {
                    System.out.println("El primer número debe ser mayor al segundo");
                    System.out.println("Vamos de nuevo\n");
                    System.out.println("Ingrese la primera cantidad");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese la segunda cantidad");
                    num2 = input.nextDouble();
                }
                resultado = num1 / num2;
                System.out.println("El resultado de la división de: " + num1 + "/ " + num2 + "es: " + resultado);
                break;
            default:
                System.out.println("Signo de operación no valido");
        }
        System.out.println("Gracias por usar la calculadora pro 2.0");
    }
}