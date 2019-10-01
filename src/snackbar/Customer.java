package snackbar;

public class Customer 
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    //constructor
    public Customer(String name, double cash)
    {
        maxId++;

        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    //methods 
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public double getCash()
    {
        return cash;
    }

    public void addCash(double newCash)
    {
        cash = cash + newCash;
    }

    public void buySnack(double totalCost)
    {
        cash = cash - totalCost;
    }

}