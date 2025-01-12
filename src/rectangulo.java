import java.util.Scanner;

public class rectangulo {
    public static void main (String[] args) {
        //Rectangulo operaciones
        double ancho, altura, area, perimetro, diagonal;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ancho y la altura del rectangulo");
        System.out.println("Ancho");
        ancho = input.nextDouble();
        System.out.println("Altura");
        altura = input.nextDouble();
        //perimetro
        perimetro = 2 * (ancho + altura);
        System.out.println("El perimetro del rectangulo es " + perimetro);
        area = ancho * altura;
        System.out.println("El area del rectangulo es " + area);
        diagonal = Math.sqrt((ancho * ancho) + (altura * altura));
        System.out.println("La diagonal del rectangulo es " + diagonal);
        System.out.println("Muchas gracias por usar el programa");
    }
}
