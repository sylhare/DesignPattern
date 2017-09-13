package pattern.structural.Adapter;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class AdapterDemo {
    public static void demo(){
        GameConsole wii = new GameConsole();

        wii.play("virtual", "Mario Galaxy");
        wii.play("cartridge", "duck hunt");
        wii.play("CD", "Halo 3");
    }
}
