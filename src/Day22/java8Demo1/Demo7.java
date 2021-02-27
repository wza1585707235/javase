package Day22.java8Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
StreamAPI
    类的特点：操作多个数据或者容器中多个数据的工具接口
    类的位置：java.util
    类的构造器：因为是接口，没有构造器
        stream获取方式有四种，主要使用三种
            1.通过Collection集合的实例方法stream()
            2.通过Arrays工具类的静态方法stream()
            3.stream中的静态方法of() 推荐
    类的方法：
        终结方法：
            在操作完毕后，直接释放流资源的方法，返回值不是stream类型
        延迟方法：
            在操作完毕后，直接释放该流资源，同时开辟一个新的流资源供其使用，返回值类型是stream
        void forEach(Consumer<? Super T> action)
        Stream<T> filter(Predicate<? super T> predicate)
            返回由该流的元素组成的流，该元素与给定的谓词匹配。
        <R> Stream<R> map(Function<? super T,? extends R> mapper)
            返回一个流，包括将给定函数应用到该流元素的结果。
        Stream<T> limit(long maxSize)
            返回一个包含该流的元素流，截断长度不超过 maxSize。
        static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
            将两个stream对象中的数据进行合并获取到一个新的stream对象
        Stream<T> skip(long n)
            返回一个包含此流的其余部分丢弃的流的第一 n元素后流。
 */
public class Demo7 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        Collections.addAll(collection,"abc","def","ghi");
        Stream<String> stream1 = collection.stream();
        System.out.println(stream1);
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        stream1.forEach( s->System.out.println(s));
        //2.
        String[] strings={"abc","def","ghi"};
        Stream<String> stream2 = Arrays.stream(strings);
        stream2.forEach(s -> System.out.println(s));
        Stream<String> stream3 = Stream.of("abc", "def", "ghi");
        stream3.forEach(s -> System.out.println(s));
    }
}
