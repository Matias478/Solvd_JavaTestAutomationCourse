public class Passenger extends Person{
    int id;
    Ticket ticket;

    public Passenger(int id,Ticket ticket, long dni, String firstName, String lastName)
    {
        super(dni,firstName,lastName);
        this.id=id;
        this.ticket=ticket;
    }

    public int getId()
    {
        return id;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n********************************************************");
        sb.append("\nID: " + getId());
        sb.append(" |Name: "+ getName()+" |DNI: "+ getDni());
        sb.append("\nTicket: \n"+ ticket.toString());

        return sb.toString();
    }

    @Override
    public String getName() {
        return super.firstName +" "+ super.lastName;
    }

    @Override
    public long getDni() {
        return super.dni;
    }

}
