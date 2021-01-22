package Day09.Array;

import java.util.Arrays;

/*
对象数组：将多个对象存到一个数组中，该数组的数据类型是对象的类型[]
Arrays数组工具类：
特点
位置 java.util
构造器 私有化，无法实例化
方法 public static copyOf(int[] original,int newLength) 深复制，可以填充或者截断
    当使用Arrays类的sort()时，无法排序自定义类型，没有排序规则，如果想排序，需要咱们自定义比较规则(比较器)
        自然排序：实现comparable接口
        定制排序：实现comparator接口
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] lsit=new int[]{1,23,4,5};
        int[] new_list= Arrays.copyOf(lsit,4);
        System.out.println(lsit);
        System.out.println(new_list);

        lsit[0]=99;
        for (int i : new_list) {
            System.out.println(i);
        }
        System.out.println(lsit.hashCode());
        System.out.println(new_list.hashCode());
    }
}
