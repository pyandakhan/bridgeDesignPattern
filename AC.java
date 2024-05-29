public class AC implements Device {
    private boolean on = false;
    private int temperature = 24;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        throw new UnsupportedOperationException("AC does not support volume");
    }

    @Override
    public void setVolume(int volume) {
        throw new UnsupportedOperationException("AC does not support volume");
    }

    @Override
    public int getChannel() {
        throw new UnsupportedOperationException("AC does not support channels");
    }

    @Override
    public void setChannel(int channel) {
        throw new UnsupportedOperationException("AC does not support channels");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm an AC unit.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current temperature is " + temperature + "°C");
        System.out.println("------------------------------------\n");
    }
}