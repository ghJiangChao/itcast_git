package Test2;

/*② 定义抽象类Phone，要求如下：
包含空参、满参构造和以下成员变
  名称name（ String 型）
生成所有成员变量set/get方法
        定义抽象方法：void playMusic(Song song)
*/
public abstract class Phone {
   private String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void playMusic(Song song);
}
