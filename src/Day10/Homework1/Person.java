package Day10.Homework1;

public class Person {
    private String name;
    private char gender;
    private int age;
    private String nation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void eat(){
        System.out.println("person eat");
    }
    public void sleep(){
        System.out.println("person sleep");
    }

    public void work(){
        System.out.println("person work");
    }
}
