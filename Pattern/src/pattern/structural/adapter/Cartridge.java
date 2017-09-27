package pattern.structural.adapter;

/**
 * Created by sylhare in 2017.
 */
public class Cartridge implements RetroPlayer {

    @Override
    public void playRetro(String gameName) {
        System.out.println("Playing cartridge. Name: "+ gameName);

    }

    @Override
    public void look8bits() {
        System.out.println("  -  It's a pixel mess!");

    }

    @Override
    public void link() {
        System.out.println("Connected via link to another cartridge!");
    }
}
