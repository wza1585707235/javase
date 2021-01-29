package Day11.HomeWork5;

public class V1Filter implements Filter {
    @Override
    public void filterUser(User U) {
        U.setType("v1");
    }
}
