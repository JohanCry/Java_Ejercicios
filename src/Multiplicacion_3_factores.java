import java.util.Scanner;

public class Multiplicacion_3_factores {
    public static void main(String[] args) {
        //Multiplicacion de 3 factores
        int num1, num2, num3, producto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 números para realizar la operación");
        System.out.println("Primer número");
        num1 = scanner.nextInt();
        System.out.println("Segundo número");
        num2 = scanner.nextInt();
        System.out.println("Tercer número");
        num3 = scanner.nextInt();
        producto = num1 * num2 * num3;
        System.out.println("El producto de " + num1 + " * " + num2 + " * " + num3 + " es " + producto);
    }
}
