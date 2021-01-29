package Day11.HomeWork5;

public class AFilter implements Filter{
    @Override
    public void filterUser(User U) {
        U.setType("A");
    }
}
