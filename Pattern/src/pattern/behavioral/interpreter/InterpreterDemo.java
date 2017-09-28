package pattern.behavioral.interpreter;

import main.people.Person;
import main.utils.And;
import main.utils.Or;

import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class InterpreterDemo {

    /**
     * Creates two expressions from 2 Person that will then be recognized when by the interpreter
     * The male part here is arbitrary it's only for demo
     * @return Males
     */
    public static Expression recognizedAsMale(Person one, Person two) {
        Expression maleOne = new Interpreter(one.getName());
        Expression maleTwo = new Interpreter(two.getName());

        return new Or(maleOne, maleTwo);
    }


    /**
     * Save the interpreter of a Person that will be considered "Married"
     * @param person
     * @return
     */
    public static Expression recognizedAsMarriedWoman(Person person) {
        Expression woman = new Interpreter(person.getName());
        Expression married = new Interpreter(person.getMaritalStatus());

        return new And(woman, married);
    }

    public static void main(String args[]) {
        Person Laura = new Person("Laura", "Female", "Married");
        Person robert = new Person("Robert", "Male", "Single");
        Person john = new Person("John", "Male", "Married");

        Expression twoMales = recognizedAsMale(robert, john);
        Expression aMarriedWoman = recognizedAsMarriedWoman(Laura);

        // The interpret check if the string is the same as the one used to create the expression
        System.out.println("John is male? " + twoMales.interpret("John"));
        System.out.println("Laura is a married women? " + aMarriedWoman.interpret("Married Laura"));
    }
}
