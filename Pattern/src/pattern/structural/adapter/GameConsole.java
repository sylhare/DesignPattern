package pattern.structural.adapter;

/**
 * Created by sylhare in 2017.
 */
public class GameConsole implements GamePlayer {
    CartridgeAdapter cartridgeAdapter;

    @Override
    public void play(String gameSupport, String gameName) {

        // Inbuilt support to Online purchased games
        if (gameSupport.equalsIgnoreCase("virtual")){
            System.out.println("Playing stored game. Name : "+ gameName);
            displayHD();
        }

        // cartridgeAdapter for the other format
        else if (gameSupport.equalsIgnoreCase("cartridge")){
            cartridgeAdapter = new CartridgeAdapter(gameSupport);
            cartridgeAdapter.play(gameSupport, gameName);
            cartridgeAdapter.displayHD();
        }

        // Default behaviour
        else {
            System.out.println("Invalid game support. " + gameSupport + " not supported");
        }
    }

    @Override
    public void displayHD() {
        System.out.println("  -  It is so HD!!");

    }
}
