package bridge.devices;

public class Radio implements Device{

    private boolean enabled;
    private int volume;
    private int channel;

    public Radio(){
        this.enabled = false;
        this.volume = 10;
        this.channel = 13;
    }

    @Override
    public boolean isEnable() {
        return this.enabled;

    }

    @Override
    public void enable() {
        this.enabled = true;
        
    }

    @Override
    public void disable() {
        this.enabled = false;

    }

    @Override
    public int getVolume() {
        return this.volume;

    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        
    }

    @Override
    public int getChannel() {
        return this.channel;

    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        
    }
    
}
