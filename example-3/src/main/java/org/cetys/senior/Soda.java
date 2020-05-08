package org.cetys.senior;

/**
 * Created by edwin on Apr, 2020
 */
public class Soda extends Product {
    private String size;
    private String flavor;

    public Soda(float price, String name, String size, String flavor) {
        super(price, name);
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
