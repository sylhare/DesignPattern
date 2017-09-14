package pattern.structural.filter;

import main.people.Person;
import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
