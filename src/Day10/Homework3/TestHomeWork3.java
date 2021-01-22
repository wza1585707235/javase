package Day10.Homework3;

public class TestHomeWork3 {
    public static void main(String[] args) {
        Person person = new Person("Alex", 23);
        cat cat = new cat(2, "黑色");
        dog dog = new dog(3, "蓝色");
        person.keepPet(cat, "猫粮");
        person.keepPet(dog, "狗粮");
    }
}
