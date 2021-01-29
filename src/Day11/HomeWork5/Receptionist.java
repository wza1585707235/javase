package Day11.HomeWork5;

public class Receptionist {
    private Filter filter;

    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void set(Filter filter,User user){
        filter.filterUser(user);
    }
}
