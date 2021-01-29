package Day11.HomeWork4;

public class CompareBig implements CompareAble{
    @Override
    public void compare(Apple A,Apple B) {
        if (A.getSize()>B.getSize()){
            System.out.println(A.getSize()+"--"+A.getColor());
        }else System.out.println(B.getSize()+"--"+B.getColor());
    }
}
