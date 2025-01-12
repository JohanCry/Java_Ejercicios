import java.util.Scanner;

public class Conversor_grados {
    public static void main(String[] args) {
        //Conversor de grados
        double gradosC, gradosF, gradosK;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Celsius");
        gradosC = scanner.nextDouble();
        System.out.println("Grados Celsius a kelvin");
        gradosK = gradosC + 273.15;
        System.out.println("Celsius a Kelvin: " + gradosK);
        System.out.println("Grados Celsius a Fahrenheit");
        gradosF = (gradosC * 18 / 10) + 32;
        System.out.println("Celsius a Fahrenheit: " + gradosF);
    }
}
