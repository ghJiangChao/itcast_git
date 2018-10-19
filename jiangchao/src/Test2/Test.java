package Test2;
/*
创建并初始化一个IPhone 对象phone和一个Song 对象s，
调用phone的 btFunction()、connecting()和playMusic(Song song)方法
示例如下：
*/
public class Test {
    public static void main(String[] args) {
        Song s = new Song("于文文","体面");
        IPone phone  = new IPone();
        phone.setName("ipone8");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(s);
    }
}



