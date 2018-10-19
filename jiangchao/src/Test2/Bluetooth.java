package Test2;
/*
① 定义接口Bluetooth，要求如下：
定义抽象方法： void btFunction()
定义默认方法： void connecting()，要求：输出"可以连接蓝牙"
*/
public interface Bluetooth {
    public abstract void btFunction();
    public default void connecting(){
        System.out.println("可以连接蓝牙");
    }
}
