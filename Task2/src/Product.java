import java.util.Random;

public abstract class Product {
    protected int amount;
    protected float price;

    public Product(int amount, float price)
    {
        this.amount = amount;
        this.price = price;
    }

    public float GetPrice()
    {
        return price;
    }
    public int GetAmount()
    {
        return amount;
    }


}
