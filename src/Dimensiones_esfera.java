import java.util.Scanner;

public class Dimensiones_esfera {
    public static void main(String[] args) {
        //Dimensiones de una esfera
        double radio, superficie, volumen;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        radio = input.nextDouble();
        superficie = 4 * Math.PI * (radio * radio);
        System.out.println("La superficie de la esfera es " + superficie);
        volumen = (4.0/3) * Math.PI * (radio * radio * radio);
        System.out.println("El volumen de la esfera es " + volumen);
    }
}
