package Day11.HomeWork3;

import java.util.Scanner;

public class Player {
    public static  FightAble select(String str){
        FightAble fightAble;
        if (str=="法力角色"){
            fightAble=new Mage();
            fightAble.specialFight();;
            fightAble.commonFight();
        }else {
            fightAble=new Warrior();
            fightAble.specialFight();
            fightAble.commonFight();
        }
        return fightAble;
    }
}
