import java.util.Scanner;

public class Suma {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        double suma = 0;
        double x;
        double y;
        System.out.println("Por favor ingrese el valor de X");
        x = numeros.nextInt();
        System.out.println("Por favor ingrese el valor de Y");
        y = numeros.nextInt();

        suma += x;
        x = x + Math.pow(y, 2);
        suma = suma + x / y;
        System.out.println("El valor de la suma es " + suma);

    }

}
