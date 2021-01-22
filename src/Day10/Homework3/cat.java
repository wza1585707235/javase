package Day10.Homework3;

public class cat extends Animal {
    public cat() {
    }

    public cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
