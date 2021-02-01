package Day15.ListDemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
list集合的四种遍历方式：
    第一种：普通的迭代器
    第二种：增强for
    第三种：特有的迭代器
    第四种：普通for
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("234");
        list.add("567");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
