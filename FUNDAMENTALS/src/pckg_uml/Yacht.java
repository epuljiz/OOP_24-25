package pckg_uml;

public class Yacht extends Boat implements Turbo{

    @Override
    public void run() {
        //super.run(); super nadjavaca funkciju run u Boat.java shitu
        System.out.println("Specific way of cruising on the sea in the Yacht");
    }

    @Override
    public void goToTurboMode() {
        System.out.println("Sailing in the turbo mode...");
    }
}
