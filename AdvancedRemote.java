public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        try {
            device.setVolume(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Mute operation not supported on this device.");
        }
    }
}
