
import java.util.Scanner;


public class como_usar_el_scanner {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner input = new Scanner(System.in);
        String nombre;
        //preguntar nombre
        System.out.println("Hola, ¿Como te llamas?");
        nombre = input.next();
        //saludar
        System.out.println("Encantado de conocerte "+ nombre);
    }
}