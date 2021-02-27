package Day15.ListDemo1;
/*
集合在删除时的注意事项：
    因为集合是大小可变的容器，在每次删除时，元素的位置和集合长度都可能变化，会造成某些数据的遗漏
 */
import Day11.pre.A;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("100元");
        list.add("20元");
        list.add("5元");
        list.add("100元");
        list.add("100元");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if ("100元".equals(list.get(i))){
                list.remove("100元");
                i--;
            }
        }
        System.out.println(list);
    }
}
