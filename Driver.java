import Monsters.Imp;
import Monsters.Kobold;
import Monsters.Monster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: Drives the Monsters.Imp.java and Monsters.Kobold.java classes.
 * Title: Driver.java
 **/

public class Driver {

    public static void  main (String[] args)   {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15,20,items));
        monsters.add(new Kobold(1, 5,items));

        for (Monster m: monsters){
            System.out.println(m);
        }

        while ((monsters.get(0).getMaxHP() > 0 && (monsters.get(1).getHp() > 0 ))){
            System.out.println(monsters.get(0).attackTarget(monsters.get(1)));
            System.out.println(monsters.get(1).attackTarget(monsters.get(0)));

        }
    }
}
