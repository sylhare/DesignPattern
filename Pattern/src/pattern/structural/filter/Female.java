package pattern.structural.filter;

import main.people.Person;
import pattern.structural.filter.Criteria;

import java.util.ArrayList;
import java.util.List;

public class Female implements Criteria {

    /**
     * meet Criteria returns a list of persons being female
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
