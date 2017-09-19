## Design Pattern

### Introduction
[Design pattern](http://abrillant.developpez.com/tutoriel/java/design/pattern/introduction/) are best practices for Object Oriented software developers. This best practice enhance reusability and maintenance of the code.

There are [23 official design patterns](https://www.tutorialspoint.com/design_pattern/design_pattern_overview.htm) (from _Design Patterns: Elements of Reusable Software_ by the _Gang of Four_) for Java. They are classed into four groups:

- 	[Creational Patterns](https://en.wikipedia.org/wiki/Creational_pattern) that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
- 	[Structural Patterns](https://en.wikipedia.org/wiki/Structural_pattern) that ease the design by identifying a simple way to realize relationships between entities.
- 	[Behavioral Patterns](https://en.wikipedia.org/wiki/Behavioral_pattern) that identify common communication patterns between objects and realize these patterns.
- 	[Concurrency Patterns](https://en.wikipedia.org/wiki/Concurrency_pattern) and J2EE that deal with the multi-threaded programming paradigm and functionalities bringed with J2EE.

### Creational Patterns

The Creational patterns are:

- **Builder**
	- Builder pattern builds a complex object using simple objects and using a step by step approach.
- **Factory**
	- In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
- **Abstract Factory** (Factory of factories)
	- In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
	- Each generated factory can give the objects as per the Factory pattern.
- **Prototype**
	- rototype pattern refers to creating duplicate object while keeping performance in mind.
    - This pattern involves implementing a prototype interface which tells to create a clone of the current object.
    - This pattern is used when creation of object directly is costly (like from big databases).
- **Singleton**
	- Singleton pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
    - This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

### Structural Patterns

### Behavioral Patterns
