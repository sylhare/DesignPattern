package pattern.structural.filter;

import main.people.Person;

import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class Or implements Criteria {

    private Criteria criteriaOne;
    private Criteria criteriaTwo;

    public Or(Criteria criteriaOne, Criteria criteriaTwo) {
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }

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
}
