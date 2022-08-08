public abstract class Person {
    long dni;
    String firstName;
    String lastName;

    protected Person(long dni,String firstName,String lastName)
    {
        this.dni=dni;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public abstract String getName();

    public abstract long getDni();



}
