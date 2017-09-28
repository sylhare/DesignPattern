package main.utils;

import main.people.Person;
import pattern.behavioral.interpreter.Expression;
import pattern.structural.filter.Criteria;

import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class Or implements Criteria, Expression {
    private Criteria criteriaOne;
    private Criteria criteriaTwo;
    private Expression expr1 = null;
    private Expression expr2 = null;


    public Or(Criteria criteriaOne, Criteria criteriaTwo) {
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }

    public Or(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    // Filter
    /**
     * First Criteria Item returns the list of person that meet criteriaOne
     * Second Criteria Item returns the list of person that meet criteriaTwo
     * Then there's a loop to add the items in the second criteria items that did not meet criteriaOne
     *
     * @param persons
     * @return List of person meeting criteria one and two
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteriaOne.meetCriteria(persons);
        List<Person> secondCriteriaItems = criteriaTwo.meetCriteria(persons);

        for (Person person : secondCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }

    // Interpret
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
