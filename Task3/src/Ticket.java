public class Ticket extends Product{
    EDestiny destiny;
    ESeason season;

    public Ticket(/*int amount,*/float price,EDestiny destiny,ESeason season)
    {
        super(/*amount,*/price);
        this.destiny=destiny;
        this.season=season;
    }
    public String GetSeason()
    {
        return this.season.toString();
    }
    public String GetDestiny()
    {
        return this.destiny.toString();
    }
    @Override
    public float getPrice() { return super.price; }
    @Override
    public int getAmount() { return super.amount; }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destiny: " + GetDestiny());
        sb.append(" |Price: " + getPrice());
        sb.append(" |Amount: " + getAmount());
        sb.append(" |Season: " + GetSeason());
        return sb.toString();
    }


}
