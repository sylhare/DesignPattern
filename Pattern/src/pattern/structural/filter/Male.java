package pattern.structural.filter;

import main.people.Person;
import pattern.structural.filter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class Male implements Criteria {

    /**
     * meet Criteria returns a list of persons being male
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
