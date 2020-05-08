package org.cetys.senior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwin on Apr, 2020
 */
abstract public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public Product[] getProducts() {
        return products.toArray(new Product[0]);
    }

    public void addItem(Product product) {
        products.add(product);
    }

    abstract public float charge();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(float payed) {
        for(Observer o: observers) {
            o.update(payed);
        }
    }
}
