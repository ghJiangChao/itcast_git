package Test1;

import java.util.Arrays;

/* 定义一个静态方法 void comp(int[]
arr),输出该数组中最大值和最小值，在main方法中定义一个int型数组，
数组元素有{2,3,-5,1,9,2}，并将该数组传入comp方法中，调用测试。
示例如下：
*
* */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -5, 1, 9, 2};
        comp(arr);
    }

    public static void comp(int[] arr) {
        Arrays.sort(arr);
        System.out.println("最大值：" + arr[arr.length - 1] + ", 最小值：" + arr[0]);
    }
}
