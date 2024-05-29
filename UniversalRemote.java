public class UniversalRemote extends AdvancedRemote {
        public UniversalRemote(Device device) {
            super(device);
        }
    
        public void maxVolume() {
            System.out.println("Remote: max volume");
            try {
                device.setVolume(100);
            } catch (UnsupportedOperationException e) {
                System.out.println("Max volume operation not supported on this device.");
            }
        }
    }
