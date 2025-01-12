import java.util.Scanner;

public class Orden_de_prioridad {
    public static void main(String[] args) {
        //Orden de prioridad
        int variable, resultado;
        Scanner scanner = new Scanner(System.in);
        //Solicitar un número
        System.out.println("Ingrese un número para realizar las operaciones");
        variable = scanner.nextInt();
        //primera operación
        System.out.println("Primera operacion");
        resultado = -6 + variable * 5; // operacion xd
        System.out.println("El resultado de (-6 + x * 5) es: " + resultado);
        //segunda operación
        System.out.println("Segunda operacion");
        resultado = ((13-2) * variable);
        System.out.println("El resultado de ((13 - 2) * x) es: " + resultado);
        //tercera operación
        System.out.println("Tercera operacion");
        resultado = ((variable + (-2)) * (20 / 10));
        System.out.println("El resultado de ((x + -2) * (20 / 10)) es: " + resultado);
        //cuarta operación
        System.out.println("Cuarta operacion");
        resultado = ((12 + variable)/5 - 4);
        System.out.println("El resultado de ((12 + x) / (5 - 4)) es: " + resultado);
    }
}
