import java.util.Scanner;

public class Cuadrado_de_un_numero {
    public static void main(String[] args) {
        //Numero al cuadrado
        int numero, cuadrado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        numero = scanner.nextInt();
        cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado);
    }
}