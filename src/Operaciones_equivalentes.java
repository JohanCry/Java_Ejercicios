import java.util.Scanner;

public class Operaciones_equivalentes {
    public static void main(String[] args) {
        //operaciones equivalentes
        int num1, num2, num3, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 números para realizar las operaciónes");
        System.out.println("Primer número");
        num1 = scanner.nextInt();
        System.out.println("Segundo número");
        num2 = scanner.nextInt();
        System.out.println("Tercer número");
        num3 = scanner.nextInt();
        System.out.println("Primer operación");
        resultado = (num1 + num2) * num3;
        System.out.println("El resultado de la primera operación (a + b) * c es: " + resultado);
        System.out.println("Segunda operación");
        resultado = (num1*num3) + (num2*num3);
        System.out.println("El resultado de la segunda operación (a*c) + (b*c) es: " + resultado);
    }
}
