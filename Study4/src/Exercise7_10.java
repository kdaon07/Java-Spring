class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void isPowerOn() {
        this.isPowerOn = true;
    }

    public void setChannel(int n) {
        this.channel = n;
        if(this.channel > MAX_CHANNEL) this.channel = MIN_CHANNEL;
        if(this.channel < MIN_CHANNEL) this.channel = MAX_CHANNEL;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setVolume(int n) {
        this.volume = n;
        if(this.volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        if(this.volume < MIN_VOLUME) this.volume = MIN_VOLUME;
    }

    public int getVolume() {
        return this.volume;
    }
}

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}
