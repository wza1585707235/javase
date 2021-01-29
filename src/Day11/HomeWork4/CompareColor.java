package Day11.HomeWork4;

public class CompareColor implements CompareAble{
    @Override
    public void compare(Apple A, Apple B) {
        if (A.getColor()=="红色"){
            System.out.println(A.getSize()+"--"+A.getColor());
        }
        if (B.getColor()=="红色"){
            System.out.println(B.getSize()+"--"+B.getColor());
        }
    }
}
