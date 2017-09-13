package main;

import pattern.creational.Prototype.PrototypeDemo;
import pattern.creational.builder.BuilderDemo;
import pattern.creational.factory.AbstractFactoryDemo;
import pattern.creational.factory.FactoryDemo;
import pattern.creational.singleton.SingletonDemo;
import pattern.structural.Adapter.AdapterDemo;
import pattern.structural.Composite.CompositeDemo;
import pattern.structural.Decorator.DecoratorDemo;
import pattern.structural.bridge.BridgeDemo;
import pattern.structural.facade.FacadeDemo;
import pattern.structural.filter.FilterDemo;

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
        AdapterDemo.demo();
        space();

        /*
         * This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes
         * independent from interface implementer classes.
         * Both types of classes can be altered structurally without affecting each other.
         */
        BridgeDemo.demo();
        space();

        /*
         * Filter pattern or Criteria pattern is a behavioral pattern that enables developers to filter a set of objects
         * using different criteria and chaining them in a decoupled way through logical operations.
         */
        FilterDemo.demo();
        space();

        /*
         * Composite pattern is used where we need to treat a group of objects in similar way as a single object.
         * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
         */
        CompositeDemo.demo();
        space();

        /*
         * Decorator pattern allows a user to add new functionality to
         * an existing object without altering its structure.
         * This pattern creates a decorator class which wraps the original class and provides additional functionality
         * keeping class methods signature intact.
         */
        DecoratorDemo.demo();
        space();

        /*
         * Facade pattern hides the complexities of the system and provides an interface to the client
         * using which the client can access the system.
         * This pattern involves a single class which provides simplified methods required by client
         * and delegates calls to methods of existing system classes.
         */
        FacadeDemo.demo();


        space();
        System.out.println("Behavioral Patterns");
        space();

        space();
        System.out.println(" Patterns");
        space();


    }

    public static void space() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
