package snackbar;

public class Snack
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;


    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;

        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //methods

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    //Object -> Snack
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name" + name + "\n" +
                        "quantity" + quantity + "\n" +
                        "cost" + cost + "\n" +
                        "vendingMachineId" + vendingMachineId + "\n";
        return rtnStr;
    }
}