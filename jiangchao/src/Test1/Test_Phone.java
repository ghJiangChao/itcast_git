package Test1;
/*A)	创建1个Phone对象，属性赋值为：品牌：“iPhone”，电量：“15”。
B)	创建完成后用这个对象调用checkPower()方法。
*/
public class Test_Phone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setPinPai("iPhone");
        p.setPower(15);
        p.checkPower();
    }
}
