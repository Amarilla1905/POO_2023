import java.util.Scanner;

public class Radio {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner Datos = new Scanner(System.in);
        System.out.println("Señor usuario ingrese el radio del circulo");
        double radio = Datos.nextInt();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double longitudC = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("La longitud de la circuferencia es: " + longitudC);

    }
}
