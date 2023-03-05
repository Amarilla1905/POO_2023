import java.util.Scanner;

public class Potencias {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner Datos = new Scanner(System.in);
        System.out.println("Señor usuario ingrese un numero");
        double numero = Datos.nextInt();
        double numeroCuadrado = Math.pow(numero, 2);
        double numeroCubo = Math.pow(numero, 3);
        System.out.println("El valor del numero elevado al cuadrado es " + numeroCuadrado);
        System.out.println("El valor del numero elevado al cubo es " + numeroCubo);

    }
}
