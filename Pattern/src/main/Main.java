package main;

import pattern.behavioral.chain.ChainDemo;
import pattern.behavioral.command.CommandDemo;
import pattern.creational.Prototype.PrototypeDemo;
import pattern.creational.builder.BuilderDemo;
import pattern.creational.factory.AbstractFactoryDemo;
import pattern.creational.factory.FactoryDemo;
import pattern.creational.singleton.SingletonDemo;
import pattern.structural.adapter.AdapterDemo;
import pattern.structural.composite.CompositeDemo;
import pattern.structural.decorator.DecoratorDemo;
import pattern.structural.bridge.BridgeDemo;
import pattern.structural.facade.FacadeDemo;
import pattern.structural.filter.FilterDemo;
import pattern.structural.flyweight.FlyweightDemo;
import pattern.structural.proxy.ProxyDemo;

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
         * composite pattern is used where we need to treat a group of objects in similar way as a single object.
         * composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
         */
        CompositeDemo.demo();
        space();

        /*
         * decorator pattern allows a user to add new functionality to
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

        /*
         * Flyweight pattern is primarily used to reduce the number of objects created and
         * to decrease memory footprint and increase performance.
         * Flyweight pattern tries to reuse already existing similar kind objects by storing them
         * and creates new object when no matching object is found.
         */
        FlyweightDemo.demo();
        space();

        /*
         * In proxy pattern, a class represents functionality of another class.
         * In proxy pattern, we create object having original object to interface its functionality to outer world.
         */
        ProxyDemo.demo();
        space();


        System.out.println("Behavioral Patterns");
        space();

        /*
         * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
         * This pattern decouples sender and receiver of a request based on type of request.
         * In this pattern, normally each receiver contains reference to another receiver.
         * If one object cannot handle the request then it passes the same to the next receiver and so on.
         */
        ChainDemo.demo();
        space();

        /*
         * A request is wrapped under an object as command and passed to invoker object.
         * Invoker object looks for the appropriate object which can handle this command and passes the command
         * to the corresponding object which executes it.
         */
        CommandDemo.demo();



    }

    public static void space() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
