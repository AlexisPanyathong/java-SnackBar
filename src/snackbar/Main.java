package snackbar;

public class Main 
{
    //fields - information
    //methods - do behaviors

    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());
        // * Processing

        // 1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        // 2. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        // 3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        // 4. Customer 1 finds $10. Print Customer 1 Cash on Hand.
        // 5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        // 6. Add 12 more items to snack 3. Print quantity of snack 3.
        // 7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

        /* #1 */
        System.out.println("Jane's current cash is: " + jane.getCash());
        System.out.println("There are: " + soda.getQuantity() + " Sodas.");
        jane.buySnack(soda.getCost() * 3);
        soda.setQuantity(soda.getQuantity() - 3);
        System.out.println("Jane bought 3 sodas and now she has: " + jane.getCash());
        System.out.println("There are: " + soda.getQuantity() + " Sodas left.");
        System.out.println("\n");

        /* #2 */
        System.out.println("Jane's current cash is: " + jane.getCash());
        System.out.println("There are: " + pretzel.getQuantity() + " Pretzels.");
        jane.buySnack(pretzel.getCost() * 1);
        pretzel.setQuantity(pretzel.getQuantity() - 1);
        System.out.println("Jane bought 1 pretzel and now she has: " + jane.getCash());
        System.out.println("There are: " + pretzel.getQuantity() + " Pretzels left.");
        System.out.println("\n");

        // 3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        System.out.println("Bob's current cash is: " + bob.getCash());
        System.out.println("There are: " + soda.getQuantity() + " Soda.");
        bob.buySnack(soda.getCost() * 2);
        soda.setQuantity(soda.getQuantity() - 2);
        System.out.println("Bob bought 2 sodas and he has: " + bob.getCash());
        System.out.println("There are: " + soda.getQuantity() + " Sodas left.");
        System.out.println("\n");

        // 4. Customer 1 finds $10. Print Customer 1 Cash on Hand.
        System.out.println("Jane's current cash is: " + jane.getCash());
        jane.addCash(10);
        System.out.println("Jane has found $10 and now has: " + jane.getCash());
        System.out.println("\n");

        // 5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        System.out.println("Jane's current cash is: " + jane.getCash());
        System.out.println("There are: " + chocolateBar.getQuantity() + " Chocolate Bar.");
        jane.buySnack(chocolateBar.getCost());
        chocolateBar.setQuantity(chocolateBar.getQuantity() - 1);
        System.out.println("Jane bought 1 chocolate bar and she has: " + jane.getCash());
        System.out.println("There are: " + chocolateBar.getQuantity() + " Chocolate Bars left.");
        System.out.println("\n");


        // 6. Add 12 more items to snack 3. Print quantity of snack 3.
        System.out.println("There are: " + pretzel.getQuantity() + " Pretzels.");
        pretzel.setQuantity(pretzel.getQuantity() + 12);
        System.out.println("There are: " + pretzel.getQuantity() + " Pretzels left.");
        System.out.println("\n");

        // 7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        System.out.println("Bob's current cash is: " + bob.getCash());
        System.out.println("There are " + pretzel.getQuantity() + " Pretzels.");
        bob.buySnack(pretzel.getCost() * 3);
        pretzel.setQuantity(pretzel.getQuantity() - 3);
        System.out.println("Bob bought 3 pretzels and now has: " + bob.getCash());
        System.out.println("There are: " + pretzel.getQuantity() + " Pretzels left.");

    }
      
}