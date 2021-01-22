package Day10.Homework3;

public class dog extends Animal {
    public dog() {
    }

    public dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something) {
        System.out.println("狗吃" + something);
    }

    public void lookhome() {
        System.out.println("狗看家");
    }
}
