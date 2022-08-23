import java.util.Random;

public abstract class Product {
    protected final int amount=1;
    protected float price;

    public Product(/*int amount*/ float price)
    {
        //this.amount = amount;
        this.price = price;
    }

    public abstract float getPrice();
    public abstract int getAmount();


}
