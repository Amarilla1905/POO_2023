import java.util.Scanner;

public class Edades {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner Datos = new Scanner(System.in);
        System.out.println("Por favor ingrese la edad de Juan");
        int EdadJuan = Datos.nextInt();
        int EdadAlberto = (2 * EdadJuan / 3);
        int EdadAna = (4 * EdadJuan / 3);
        System.out.println("La edad de Alberto es " + EdadAlberto);
        System.out.println("La edad de Juan es " + EdadJuan);
        System.out.println("La edad de Ana es " + EdadAna);
        System.out.println("La edad de la mamá es " + (EdadJuan + EdadAlberto + EdadAna));
    }

}
