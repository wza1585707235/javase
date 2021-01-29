package Day11.HomeWork3;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通打击");
    }

}
