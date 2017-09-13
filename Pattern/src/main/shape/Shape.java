package main.shape;

import pattern.creational.builder.*;

/**
 * Created by sylhare in 2017.
 */
public abstract class Shape implements Item, Cloneable {
    private String id;
    protected Integer edge;
    protected DrawAPI drawAPI; // For Bridge Pattern

    /**
     * Default constructor
     */
    protected Shape() {}

    // For Bridge Pattern
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    // For Factory Pattern
    public abstract void draw();

    // For Builder Pattern
    @Override
    public Packing packing() {
        return new Mold();
    }

    @Override
    public abstract float price();

    // For prototype Pattern
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Give the number of Edge in the shape
     * @return the number of edge
     */
    public Integer getEdge(){
        return edge;
    }

    // From the cloneable Interface
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
