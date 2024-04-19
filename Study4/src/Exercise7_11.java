class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int finishc;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int n) {
        this.finishc = this.channel;
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

    public void gotoPrevChannel() {
        int temp = this.channel;
        this.channel = this.finishc;
        this.finishc = temp;
    }
}

public class Exercise7_11 {
    public static void main(String[] args) {
        MyTv3 t = new MyTv3();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
