package Day22.java8Demo1;

import java.util.stream.Stream;

public class Demo8 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("123", "456", "789");
        stringStream.forEach(s -> System.out.println(s));
        //过滤
        stringStream = Stream.of("123", "456", "789");
        Stream<String> stringStream1 = stringStream.filter(s -> s.startsWith("1"));
        stringStream1.forEach(s -> System.out.println(s));
        //转换
        stringStream=Stream.of("11","22","33");
        stringStream.map(s ->Integer.parseInt(s)).forEach(s-> System.out.println(s));
        //获取流对象中的个数
        stringStream=Stream.of("11","22","33");
        System.out.println(stringStream.count());
        //截取前2个
        stringStream=Stream.of("11","22","33");
        Stream<String> limit = stringStream.limit(2);
        limit.forEach(s -> System.out.println(s));
        System.out.println("=======================================================");
        //流对象中跳过第一个
        stringStream=Stream.of("11","22","33");
        stringStream.skip(1).forEach(s -> System.out.println(s));
        System.out.println("=======================================================");
        //合并     静态方法
        stringStream=Stream.of("11","22","33");
        stringStream1=Stream.of("11","22","33");
        Stream.concat(stringStream,stringStream1).forEach(s -> System.out.println(s));
    }
}
