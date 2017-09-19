package pattern.structural.proxy;

/**
 * Created by sylhare in 2017.
 */
public class File implements Display {

    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
