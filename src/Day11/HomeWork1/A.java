package Day11.HomeWork1;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBB");
    };
}
