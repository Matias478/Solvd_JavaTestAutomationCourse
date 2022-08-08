
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Airline airLine = new Airline();

        System.out.println("Elija el destino para ver los pasajeros por temporada:");
        for (EDestiny  item : EDestiny.values() ) {
            System.out.println(item.toString());
        }
        String strDestiny = in.nextLine();
        if (strDestiny=="")
        {
            System.out.println("Eliga un destino valido: ");
        }
        EDestiny destiny = EDestiny.valueOf(strDestiny);
        System.out.println("La cantidad de pasajeros por temporada del destino elegido son: "+ airLine.passengersPerSeason(destiny));

        System.out.println(airLine.toString());

    }

}
