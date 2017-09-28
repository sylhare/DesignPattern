package main.utils;

import main.people.Person;
import pattern.behavioral.interpreter.Expression;
import pattern.structural.filter.Criteria;

import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class And implements Criteria, Expression {
    private Criteria criteriaOne;
    private Criteria criteriaTwo;
    private Expression expr1 = null;
    private Expression expr2 = null;

    public And(Criteria criteriaOne, Criteria criteriaTwo) {
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }

    public And(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    // Filter
    /**
     * If criteriaOne meet criteria, then test criteriaTwo
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteriaOne.meetCriteria(persons);
        return criteriaTwo.meetCriteria(firstCriteriaPersons);
    }

    // Interpreter
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}