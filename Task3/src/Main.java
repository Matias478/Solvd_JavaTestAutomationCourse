import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Airline airLine = new Airline();

        // ****** Shows the number of passangers per destiny ******
        System.out.println("Elija el destino para ver los pasajeros por temporada:");
        for (EDestiny item : EDestiny.values() ) {
            System.out.println(item.toString());
        }
        String strDestiny = in.nextLine();
        while (strDestiny.isEmpty())
        {
            System.out.println("Elija un destino valido: ");
            strDestiny = in.nextLine();
        }
        EDestiny destiny = EDestiny.valueOf(strDestiny);
        System.out.println("\nLa cantidad de pasajeros por temporada del destino elegido son: "+ airLine.passengersPerSeason(destiny));

        // ****** Shows the list of passengers ******
        System.out.println("\n"+airLine.toString());

        // ****** Search a passanger by id ******
        System.out.println("\nDesea buscar un pasajero por ID? si=1/no=0");
        int response = in.nextInt();
        while (response != 0 && response != 1)
        {
            System.out.println("Error ingreso un valor invalido. Desea buscar un pasajero por ID? si=1/no=0");
            response = in.nextInt();
        }
        if(response==1)
        {
            System.out.println("Ingrese el id del pasajero");
            int auxId = in.nextInt();
            System.out.println("\nEl pasajero buscado es: "+airLine.showPassengerSelected(auxId));
        }

    }

}
