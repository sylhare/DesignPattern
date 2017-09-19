package pattern.structural.proxy;

/**
 * Created by sylhare in 2017.
 * Functionality of displaying of the class file only
 */
public class ProxyDisplay implements Display {

    private File file;
    private String fileName;

    public ProxyDisplay(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(file == null){
            file = new File(fileName);
        }
        file.display();
    }
}