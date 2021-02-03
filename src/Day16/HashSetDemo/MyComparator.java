package Day16.HashSetDemo;

import java.util.Comparator;

public class MyComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if (o1.getAge()- o2.getAge()==0){
            return o1.getId()-o2.getId();
        }
        return o1.getAge()- o2.getAge();
    }
}
