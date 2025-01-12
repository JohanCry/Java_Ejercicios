import java.util.Scanner;

public class Media_aritmetica {
    public static void main(String[] args) {
        //Media aritmetica
        int fac1, fac2, fac3, fac4, media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 4 números para realizar la operación");
        System.out.println("Primer número");
        fac1 = scanner.nextInt();
        System.out.println("Segundo número");
        fac2 = scanner.nextInt();
        System.out.println("Tercer número");
        fac3 = scanner.nextInt();
        System.out.println("Cuarto número");
        fac4 = scanner.nextInt();
        media = (fac1 + fac2 + fac3 + fac4) / 4;
        System.out.println("La media aritmética de " + fac1 + ", " + fac2 + ", " + fac3 + " y " + fac4 + " es " + media);
    }
}
