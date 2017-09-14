package pattern.structural.filter;

import main.people.Person;
import pattern.structural.filter.Criteria;

import java.util.ArrayList;
import java.util.List;


public class Single implements Criteria {

    /**
     * meet Criteria returns a list of persons being single
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}