package sort;

import java.util.Arrays;

/**
 * 2020/12/10
 * @author  liuzhuang
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] target = {1,1,5,8,8,7};
        int[] contain = new int[9];
  //  将要排序的数字放入相应的桶中 并记录数字出现的次数
        for (int i = 0; i < target.length; i++) {
            contain[target[i]]++;
        }
        System.out.println(Arrays.toString(contain));

      // 打印桶的下标（桶的下标就是数字的值） 桶存储的值就是数字出现的次数  桶值为0代表 当前下标所对应的数字没有出现。

        // 从小到大 打印
        for (int i = 0; i < contain.length; i++) {
            for (int i1 = 0; i1 < contain[i]; i1++) {
                System.out.print(" "+i);
            }
        }
        System.out.println(" ");

        for (int i = contain.length-1;i>0; i--) {
            for (int i1 = 0; i1 < contain[i]; i1++) {
                System.out.print(" "+i);
            }
        }

    }


}
