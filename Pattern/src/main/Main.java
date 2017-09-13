package main;

import pattern.creational.Prototype.PrototypeDemo;
import pattern.creational.builder.BuilderDemo;
import pattern.creational.factory.AbstractFactoryDemo;
import pattern.creational.factory.FactoryDemo;
import pattern.creational.singleton.SingletonDemo;
import pattern.structural.bridge.BridgeDemo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creational Patterns");
        space();

        /*
        * In Factory pattern, we create object without exposing the creation logic to the client
        * and refer to newly created object using a common interface.
        */
        FactoryDemo.demo();

        space();

        /*
         * In Abstract Factory pattern an interface is responsible for creating a factory of related objects
         * without explicitly specifying their classes.
         * Each generated factory can give the objects as per the Factory pattern.
        */
        AbstractFactoryDemo.demo();
        space();

        /*
        * Singleton pattern involves a single class which is responsible to create an object
        * while making sure that only single object gets created.
        * This class provides a way to access its only object which can be accessed directly
        * without need to instantiate the object of the class.
        */
        SingletonDemo.demo();
        space();

        /*
         * Builder pattern builds a complex object using simple objects and using a step by step approach.
         */
        BuilderDemo.demo();
        space();

        /*
         * Prototype pattern refers to creating duplicate object while keeping performance in mind.
         * This pattern involves implementing a prototype interface which tells to create a clone of the current object.
         * This pattern is used when creation of object directly is costly (like from big databases)
         */
        PrototypeDemo.demo();
        space();

        space();
        System.out.println("Structural Patterns");
        space();

        /*
         * This pattern involves a single class which is responsible to join
         * functionality of independent or incompatible interfaces.
         * Make an object work with an interface it does not have.
         */

        space();

        /*
         * This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes
         * independent from interface implementer classes.
         * Both types of classes can be altered structurally without affecting each other.
         */
        BridgeDemo.demo();


    }

    public static void space() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
