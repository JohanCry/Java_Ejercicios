import java.util.Scanner;

public class tres_letras {
    public static void main(String[] args) {
        //variables
        String letra1, letra2, letra3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 3 letras");
        System.out.println("Primera letra");
        letra1 = input.nextLine();
        System.out.println("Segunda letra");
        letra2 = input.nextLine();
        System.out.println("Tercera letra");
        letra3 = input.nextLine();
        System.out.println("Al revés: " + letra3 + ", " + letra2 + ", " + letra1);
        System.out.println("Muchas gracias");
    }
}
