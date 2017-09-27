package pattern.structural.adapter;

/**
 * Created by sylhare in 2017.
 * The Cartridge adapter does not require to implement or adapt everything from the Cartridge Class
 */
public class CartridgeAdapter implements GamePlayer {
    RetroPlayer retroPlayer;

    public CartridgeAdapter(String gameSupport){
            retroPlayer = new Cartridge();
    }

    @Override
    public void play(String gameSupport, String gameName) {
            retroPlayer.playRetro(gameName);
    }

    @Override
    public void displayHD() {
        retroPlayer.look8bits();
    }
}
