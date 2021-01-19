package day08.sta;

public class Student {
    private int id;
    private  String name;
    private int age;
    private static int number=2021001;

    public Student(String name, int age) {
        id=number++;
        this.name = name;
        this.age = age;
    }

    public Student() {
        id=number++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String print(){
        return id+"  "+name+"  "+age;
    }
}
