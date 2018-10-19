package Test1;

import java.util.ArrayList;
import java.util.Scanner;

/*提示用户在控制台上输入五个字符串，将这五个字符串存放在ArrayList集合中
筛选集合中长度小于5的元素(字符串),存到一个新的集合中. 并打印这个新集合中所有的元素.
*
* */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入五个字符串：");
        for (int i = 0; i < 5; i++) {
            list.add(sca.nextLine());
        }
        ArrayList<String> list2 = new ArrayList<>();
        //判断每个元素是否长度是否小于5
        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            if (s.length() < 5) {
                list2.add(s);
            }
        }
        for (int k = 0; k < list2.size(); k++) {
            System.out.println(list2.get(k));
        }
    }
}
