package Test1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/* 提示用户输入消费金额，根据消费金额输出对应的折扣
，并根据折扣在控制台输出对应折扣后的金额，折扣的范围如下（P代表消费的金额）：
P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，0<=P<500 不打折
演示格式如下：
*
* */
public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        int p = s.nextInt();
        double d;
        if (p >= 2000) {
             d =p * 0.7;
            System.out.println("折扣7折，" + "打折前金额：" +p + ",打折后金额：" + d);
        }else if(p>=1000&&p<2000){
            d=p*0.8;
            System.out.println("折扣8折，" + "打折前金额：" +p + ",打折后金额：" + d);
        }else if(p>=500&&p<1000){
            d=p*9.5;
            System.out.println("折扣9.5折，" + "打折前金额：" + p + ",打折后金额：" + d);
        }else if(p>=0&&p<500){
            System.out.println("不打折，金额" +p );
        }
    }
}
