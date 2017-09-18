package pattern.structural.filter;

import main.people.*;
import main.utils.And;
import main.utils.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class FilterDemo {
    public static void demo(){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Erika", "Female", "Single"));

        Criteria male = new Male();
        Criteria female = new Female();
        Criteria single = new Single();
        Criteria singleMale = new And(single, male);
        Criteria singleOrFemale = new Or(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}

