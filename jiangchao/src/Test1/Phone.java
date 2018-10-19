package Test1;
/*	创建Phone（手机）类，Phone类中包含以下内容：
A）	成员属性：String类型的品牌
int类型的剩余电量
B）	set和get方法
C）	非静态无参无返回值的成员方法：
checkPower()。方法内实现：判断当前对象的剩余电量，如果剩余电量低于20，那么在控制台打印“电量过低，请充电”。
*
* */
public class Phone {
    private  String pinPai;
    private  int power;

    public String getPinPai() {
        return pinPai;
    }

    public void setPinPai(String pinPai) {
        this.pinPai = pinPai;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int dianL) {
        this.power = dianL;
    }
    public void checkPower(){
        if (power < 20) {
            System.out.println("电量过低，请充电");
        }
    }
}

