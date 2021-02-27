package Day15.CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
集合的遍历Iterator
    类的特点：
        对collection进行迭代的迭代器工具类
    类的位置：
        java,util
    类的构造器：无，通过collection接口中的iterator()进行获取对象
    类的方法：
        boolean hasnext()如果仍有元素可以迭代，返回true
        Object next()返回迭代的下一个元素
        void remove()从迭代器指向的collection中移除迭代器返回的最后一个元素

        next()将下一个元素迭代出来，将指针向下移动一位

ConcurrrentModificationException
    并发修改异常
    注意事项：集合通过迭代器进行便利的时候，不要对集合做任何修改，可能会产生并发修改异常
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
