package pattern.structural.filter;

import main.people.Person;
import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class And implements Criteria {

    private Criteria criteriaOne;
    private Criteria criteriaTwo;

    public And(Criteria criteriaOne, Criteria criteriaTwo) {
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }

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
}