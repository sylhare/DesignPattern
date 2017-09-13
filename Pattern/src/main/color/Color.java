package main.color;

import pattern.creational.builder.Bucket;
import pattern.creational.builder.Item;
import pattern.creational.builder.Packing;

/**
 * Created by sylhare in 2017.
 */
public abstract class Color implements Item {

    @Override
    public Packing packing() {
        return new Bucket();
    }

    @Override
    public abstract float price();
}
