package Test2;

public  class IPone extends Phone implements Bluetooth{
    public IPone(String name) {
        super(name);
    }

    public IPone() {

    }
    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }
    @Override
    public void playMusic(Song song) {
        System.out.println(getName()+"手机正在播放"+song.getSinger()+"唱的"+song.getName());
    }
}

