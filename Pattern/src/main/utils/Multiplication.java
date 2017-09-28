package main.utils;

import pattern.behavioral.strategy.Strategy;

/**
 * Created by sylhare in 2017.
 */
public class Multiplication implements Strategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 * num2;
    }
}