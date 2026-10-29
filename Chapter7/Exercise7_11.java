class MyTv2 {
    private int channel;
    private int prevChannel;
    private int tmp;

    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    public int getChannel() {
        return channel;
    }

    public void gotoPrevChannel() {
        tmp = channel;
        setChannel(prevChannel);
    }
}

class Exercise7_11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    }
}