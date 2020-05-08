package org.cetys.junior;

/**
 * Created by edwin on Apr, 2020
 */
public class Burger extends Product {
    private String size;
    private String style;

    public Burger(float price, String name, String size, String style) {
        super(price, name);
        this.size = size;
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
