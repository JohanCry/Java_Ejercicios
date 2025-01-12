import java.util.Scanner;

public class Division_y_modulo {
    public static void main(String[] args) {
        //Division y modulo
        int num1, num2, division, modulo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera cantidad");
        num1 = scanner.nextInt();
        System.out.println("Ingrese la segunda cantidad");
        num2 = scanner.nextInt();
        division = num1 / num2;
        modulo = num1 % num2;
        System.out.println("La division de " + num1 + " / " + num2 + " es " + division);
        System.out.println("El modulo de " + num1 + " % " + num2 + " es " + modulo);
    }
}
