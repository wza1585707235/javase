package Day16.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/*
Collections类
    类的特点：针对Collection单列集合操作的工具类
    类的位置：java.util
    类的构造器：构造器私有化
    类的方法：
        public static <T> boolean addAll(Collection<? super T> c,T... elements)
            将所有指定元素添加到指定 collection 中。
        public static void reverse(List<?> list)
            反转指定列表中元素的顺序。
        public static void shuffle(List<?> list)
            使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
 */
public class Demo1 {
    public static void main(String[] args) {
        //在指定的Collection中批量添加数据
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"123","456","789");
        System.out.println(arrayList);
        //针对集合中的元素顺序进行打乱  不可以对set类型使用，因为set有自己的hashcode排序方式
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //反转
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
