import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = in.nextLine();

        System.out.println("Bienvenido "+ nombre +" "+apellido);

    }


}
