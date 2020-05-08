package org.cetys.senior;

/**
 * Created by edwin on Apr, 2020
 */
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(float payed) {
        System.out.println(name + ", the order cost: $" + payed);
    }
}
