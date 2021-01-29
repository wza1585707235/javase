package Day11.HomeWork5;

public class V2Filter implements Filter{
    @Override
    public void filterUser(User U) {
        U.setType("v2");
    }
}
