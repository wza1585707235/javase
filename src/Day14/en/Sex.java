package Day14.en;

public enum Sex {
    boy("李雷"),girl("韩梅梅");
    private String name;

    Sex() {
    }

    Sex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
