import java.util.Scanner;

public class division_por_cero {
    public static void main(String[] args) {
        //Division por cero
        int num1, num2, division;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera cantidad");
        num1 = scanner.nextInt();
        System.out.println("Ingrese la segunda cantidad");
        num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            division = num1 / num2;
            System.out.println("La division de " + num1 + " / " + num2 + " es " + division);
        }
    }
}