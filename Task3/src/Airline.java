import java.util.ArrayList;
public final class Airline implements IAirLine { //Guarda con el final en la clase !!!!!
    ArrayList<Passenger> listPassengers;

    public Airline() {
        listPassengers = new ArrayList<Passenger>();
        loadPassengers(listPassengers);
    }

     private static void loadPassengers(ArrayList<Passenger> passengers) {
        passengers.add(new Passenger(1, new Ticket(/*1,*/ 250, EDestiny.Argentina, ESeason.Spring), 43565566, "Matias", "Ferrari"));
        passengers.add(new Passenger(2, new Ticket( 670, EDestiny.Australia, ESeason.Autumn), 343675566, "Fede", "Barletta"));
        passengers.add(new Passenger(3, new Ticket( 450, EDestiny.Japan, ESeason.Winter), 34565566, "Orlanco", "Orus"));
        passengers.add(new Passenger(4, new Ticket( 330, EDestiny.Mexico, ESeason.Summer), 45565566, "Oscu", "Desdra"));
        passengers.add(new Passenger(5, new Ticket( 330, EDestiny.Mexico, ESeason.Summer), 38565566, "Vivaldi", "Organo"));
        passengers.add(new Passenger(6, new Ticket( 330, EDestiny.Japan, ESeason.Spring), 39565566, "Coscu", "Desdramiento"));
        passengers.add(new Passenger(7, new Ticket( 360, EDestiny.USA, ESeason.Summer), 45565566, "Martin", "Desdra"));
        passengers.add(new Passenger(8, new Ticket( 340, EDestiny.USA, ESeason.Summer), 38565566, "Veigar", "Organo"));
        passengers.add(new Passenger(9, new Ticket( 230, EDestiny.Japan, ESeason.Spring), 39565566, "Atroxx", "Desdramiento"));
        passengers.add(new Passenger(10, new Ticket( 530, EDestiny.USA, ESeason.Summer), 45565566, "Illaoi", "Desdrada"));
        passengers.add(new Passenger(11, new Ticket( 700, EDestiny.Canada, ESeason.Winter), 38565566, "Garen", "Organo"));
        passengers.add(new Passenger(12, new Ticket( 450, EDestiny.France, ESeason.Spring), 39565566, "Fiora", "Desdramiento"));
        passengers.add(new Passenger(13, new Ticket( 330, EDestiny.Spain, ESeason.Summer), 45565566, "Illaoi", "Desdrada"));
        passengers.add(new Passenger(14, new Ticket( 600, EDestiny.Italy, ESeason.Spring), 38565566, "Garen", "Organo"));
        passengers.add(new Passenger(15, new Ticket( 470, EDestiny.Japan, ESeason.Winter), 39565566, "Fiora", "Desdramiento"));
        passengers.add(new Passenger(16, new Ticket( 230, EDestiny.Argentina, ESeason.Spring), 45565566, "Illaoi", "Desdrada"));
        passengers.add(new Passenger(17, new Ticket( 500, EDestiny.Australia, ESeason.Autumn), 38565566, "Garen", "Organo"));
        passengers.add(new Passenger(18, new Ticket( 550, EDestiny.Mexico, ESeason.Summer), 39565566, "Fiora", "Desdramiento"));
        passengers.add(new Passenger(19, new Ticket( 370, EDestiny.Canada, ESeason.Winter), 35535566, "Yasuo", "Desdramiento"));
        passengers.add(new Passenger(20, new Ticket( 600, EDestiny.Italy, ESeason.Summer), 38525566, "Momo", "Desdramiento"));
    }

    public int passengersPerSeason(EDestiny destiny) {
        int aux = 0;
        for (Passenger item : listPassengers) {
            switch (destiny) {
                case Argentina:
                    if (item.ticket.GetSeason() == "Spring" && item.ticket.GetDestiny() == "Argentina") {
                        aux++;
                    }
                    break;
                case Japan:
                    if (item.ticket.GetSeason() == "Winter" && item.ticket.GetDestiny() == "Japan") {
                        aux++;
                    }
                    break;
                case Mexico:
                    if (item.ticket.GetSeason() == "Summer" && item.ticket.GetDestiny() == "Mexico") {
                        aux++;
                    }
                    break;
                case USA:
                    if (item.ticket.GetSeason() == "Summer" && item.ticket.GetDestiny() == "USA") {
                        aux++;
                    }
                    break;
                case Australia:
                    if (item.ticket.GetSeason() == "Summer" && item.ticket.GetDestiny() == "Australia") {
                        aux++;
                    }
                    break;
                case France:
                    if (item.ticket.GetSeason() == "Spring" && item.ticket.GetDestiny() == "France") {
                        aux++;
                    }
                    break;
                case Italy:
                    if (item.ticket.GetSeason() == "Summer" && item.ticket.GetDestiny() == "Italy") {
                        aux++;
                    }
                    break;
                case Spain:
                    if (item.ticket.GetSeason() == "Spring" && item.ticket.GetDestiny() == "Spain") {
                        aux++;
                    }
                    break;
                case Canada:
                    if (item.ticket.GetSeason() == "Winter" && item.ticket.GetDestiny() == "Canada") {
                        aux++;
                    }
                    break;
            }

        }

        return aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de pasajeros: ");
        for (Passenger item : listPassengers) {
            sb.append(item.toString());
        }
        return sb.toString();
    }

    @Override
    public int findById(int auxId) {
        int aux=0;
        for (Passenger item : listPassengers) {
            if(item.getId()==auxId)
            {
                aux = item.getId();
            }
        }
        return aux;
    }

    @Override
    public String showPassengerSelected(int auxId) {
        int aux=findById(auxId);
        if(aux!=0)
        {
            return listPassengers.get(aux-1).toString();
        }
        return "";
    }


}
