package bridge.control;

import bridge.devices.Device;

public class Remote {
    
    protected Device device;

    public Remote(Device device){
        this.device = device;
    }

    public void togglePower(){
        if(this.device.isEnable()){
            this.device.disable();
        }else{
            this.device.enable();
        }
    }

    public void volumeDown(){
        int percent = this.device.getVolume();
        this.device.setVolume(percent--);
    }

    public void volumeUp(){
        int percent = this.device.getVolume();
        this.device.setVolume(percent++);
    }

    public void channelDown(){
        int channel = this.device.getChannel();
        this.device.setChannel(channel--);
    }

    public void channelUp(){
        int channel = this.device.getChannel();
        this.device.setChannel(channel++);
    }

}
