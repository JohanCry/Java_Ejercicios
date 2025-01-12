import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        int edad;
        Scanner hola = new Scanner(System.in);
        System.out.println("Hola, ¿Cuántos años tienes?");
        edad = hola.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor");
        }
        else {
            System.out.println("Eres menor");
        }
    }
}
