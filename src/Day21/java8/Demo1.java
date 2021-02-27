package Day21.java8;

public class Demo1 {
    InterfaceName interfaceName=new InterfaceName() {

        @Override
        public void print(String str) {
            System.out.println(str);
        }
    };

    InterfaceName a=str -> System.out.println(str);
}
