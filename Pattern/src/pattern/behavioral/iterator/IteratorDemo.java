package pattern.behavioral.iterator;

/**
 * Created by sylhare in 2017.
 */
public class IteratorDemo {

    public static void demo() {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}