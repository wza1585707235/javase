package Day10.Homework3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(dog dog, String something) {
        System.out.println(name + "喂养宠物狗" + dog.getColor() + something);
    }

    public void keepPet(cat cat, String something) {
        System.out.println(name + "喂养宠物猫" + cat.getColor() + something);
    }
}
