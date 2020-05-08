package org.cetys.senior;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // menu
//        var burgerSimple = new Burger(20, "simple burger", "single", "beef");
//        var burgerDouble = new Burger(30, "double burger", "double", "beef");
//        var burgerChicken = new Burger(15, "chicken burger", "single", "chicken");
//        var sodaSmallCola = new Soda(10, "small coke", "small", "cola");
//        var sodaSmallLime = new Soda(10, "small sprite", "small", "lime");
//        var sodaBigCola = new Soda(25, "big coke", "big", "cola");

        Customer customerEdwin = new Customer("Edwin");
        Customer customerDania = new Customer("Dania");

        ProductFactory factory = ProductFactory.getInstance();

        var order1 = new NormalOrder(1);
        order1.addItem(factory.createProduct("simple burger"));
        order1.addItem(factory.createProduct("simple burger"));
        order1.addItem(factory.createProduct("big coke"));
        order1.charge();

        var order2 = new OnlineOrder(customerEdwin);
        order2.attach(customerEdwin);
        order2.attach(customerDania);
        order2.addItem(factory.createProduct("chicken burger"));
        order2.addItem(factory.createProduct("small sprite"));
        order2.charge();
    }
}
